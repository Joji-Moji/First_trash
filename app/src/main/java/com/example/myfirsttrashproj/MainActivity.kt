package com.example.myfirsttrashproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirsttrashproj.databinding.ActivityMainBinding
import kotlin.math.pow
import kotlin.math.sqrt


private lateinit var  binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickResult (view: View){
        if (!isFieldEmpty()) {
            val result =  getString(R.string.text_info) + getResult()
            binding.tvText.text = result

        }
    }
    private fun isFieldEmpty(): Boolean { // проверка на наличие введенных значений
        binding.apply {

           if(edA.text.isNullOrEmpty()) edA.error = "Поле должно быть заполненно"
           if(edB.text.isNullOrEmpty()) edB.error = "Поле должно быть заполненно"
            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()

        }
    }
    private fun getResult(): String{
        val a: Double // переводим для использования уровнений и куда будем сохранять
        val b: Double
        binding.apply {
             a = edA.text.toString().toDouble()
             b = edB.text.toString().toDouble()
        }
        return sqrt( (a.pow(2) + b.pow(2))  ).toString()//  формула
    }

}
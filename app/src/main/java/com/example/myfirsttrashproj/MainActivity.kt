package com.example.myfirsttrashproj

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.myfirsttrashproj.databinding.ActivityMainBinding


private lateinit var  binding: ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    fun onClickResult (view: View){
        if (!isFieldEmpty()){

        }
    }
    private fun isFieldEmpty(): Boolean { // проверка на наличие введенных значений
        binding.apply {
            val b = R.string.nullEmpty.toString()
           if(edA.text.isNullOrEmpty()) edA.error = b
           if(edB.text.isNullOrEmpty()) edB.error = b
            return edA.text.isNullOrEmpty() || edB.text.isNullOrEmpty()

        }
    }
    private fun getResult(): String{
        val a: Double // переводим для использования уровнений
        val b: Double
        binding.apply {
             a = edA.text.toString().toDouble()
             b = edB.text.toString().toDouble()
        }
        return
    }

}
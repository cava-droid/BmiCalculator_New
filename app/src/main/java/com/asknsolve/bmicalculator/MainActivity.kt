package com.asknsolve.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.asknsolve.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.resultButton.setOnClickListener{
            val intent = Intent(this,ResultActivity::class.java)
/*
            .text를 붙이지 않아 error 발생한 것이었음!!!

            val mainHeight = binding.heightEditText.text.toString()
            val mainWeight = binding.weightEditText.text.toString()

            Log.d("mainActivity", "mainHeight = $mainHeight , mainWeight = $mainWeight")
*/
            intent.putExtra("height", binding.heightEditText.text.toString())
            intent.putExtra("weight", binding.weightEditText.text.toString())
            startActivity(intent)
        }
    }
}
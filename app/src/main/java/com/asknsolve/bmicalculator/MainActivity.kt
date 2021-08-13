package com.asknsolve.bmicalculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asknsolve.bmicalculator.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val intent = Intent(this,ResultActivity::class.java)

        binding.resultButton.setOnClickListener{
            intent.putExtra("height", binding.heightEditText.toString())
            intent.putExtra("weight", binding.weightEditText.toString())
            startActivity(intent)
        }
    }
}
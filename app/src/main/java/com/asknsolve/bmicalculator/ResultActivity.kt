package com.asknsolve.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.asknsolve.bmicalculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityResultBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}
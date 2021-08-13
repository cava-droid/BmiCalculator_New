package com.asknsolve.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.asknsolve.bmicalculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityResultBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        //전달받은 키와 몸무게
        val height = intent.getStringExtra("height")?.toInt()
        val weight = intent.getStringExtra("weight")?.toInt()

        // error 체크, MainActivity 문제였음
        // Log.d("resultActivity", "resultHeight = $height , resultWeight = $weight" )

        // BMI 계산
//        val bmi = weight / Math.pow(height / 100.0, 2.0)

//        Log.d("bmi", "bmi = $bmi")
    }
}
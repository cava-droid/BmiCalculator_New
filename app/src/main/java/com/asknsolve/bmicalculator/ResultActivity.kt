package com.asknsolve.bmicalculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.asknsolve.bmicalculator.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    val binding by lazy{
        ActivityResultBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        // 전달받은 키와 몸무게
        // BMI 계산 위해 !!. 사용
        val height = intent.getStringExtra("height")!!.toInt()
        val weight = intent.getStringExtra("weight")!!.toInt()

        // error 체크, MainActivity 문제였음
        // Log.d("resultActivity", "resultHeight = $height , resultWeight = $weight" )

        // BMI 계산
        val bmi = weight / Math.pow(height / 100.0, 2.0)
        //Log.d("bmi", "bmi = $bmi")

        // 결과 표시
        when {
            bmi >= 40 -> binding.resultTextView.text = "3단계 비만"
            bmi >= 30 -> binding.resultTextView.text = "2단계 비만"
            bmi >= 25 -> binding.resultTextView.text = "1단계 비만"
            bmi >= 18.5 -> binding.resultTextView.text = "정상"
            else -> binding.resultTextView.text = "고도 비만"
        }

        // 이미지 표시
        when {
            bmi >= 25 ->
                binding.imageView.setImageResource(
                    R.drawable.ic_baseline_sentiment_very_dissatisfied_24
                )
            bmi >= 18.5 ->
                binding.imageView.setImageResource(
                    R.drawable.ic_baseline_sentiment_satisfied_alt_24
                )
            else ->
                binding.imageView.setImageResource(
                    R.drawable.ic_baseline_sentiment_dissatisfied_24
                )
        }

        // BMI값 표시
        Toast.makeText(this,"$bmi",Toast.LENGTH_LONG).show()
    }
}
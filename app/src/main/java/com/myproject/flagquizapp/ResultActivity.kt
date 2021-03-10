package com.myproject.flagquizapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.myproject.flagquizapp.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityResultBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set username in result view
        val username = intent.getStringExtra(Constants.USERNAME)
        binding.tvName.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        binding.tvScore.text = "Your Score is $correctAnswers out of $totalQuestions"

        // Click finish to restart the quiz
        binding.btnFinish.setOnClickListener {
            // Create the intent directly inside startActivity
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }


    }
}
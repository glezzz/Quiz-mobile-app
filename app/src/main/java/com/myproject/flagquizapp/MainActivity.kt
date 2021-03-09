package com.myproject.flagquizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        val startButton: Button = findViewById(R.id.btn_start)
        val etName: EditText = findViewById(R.id.et_name)

        startButton.setOnClickListener {
            if (etName.text.toString().isEmpty()) {
                Toast.makeText(
                    this,
                    "Please, enter your name", Toast.LENGTH_SHORT
                ).show()

            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                startActivity(intent)
                finish()
            }
        }

    }
}
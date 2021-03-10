package com.myproject.flagquizapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.myproject.flagquizapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN

        binding.btnStart.setOnClickListener {
            if (binding.etName.text.toString().isEmpty()) {
                Toast.makeText(
                    this,
                    "Please, enter your name", Toast.LENGTH_SHORT
                ).show()

            } else {
                // This is the way to move to another/next Activity
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                // Send this information (username) over with the intent to next activity (QuizQuestionsActivity)...
                intent.putExtra(Constants.USERNAME, binding.etName.text.toString())
                // ...by starting this intent so we can retrieve the info there
                startActivity(intent)
                finish()
            }
        }

    }
}
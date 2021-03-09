package com.myproject.flagquizapp

import android.os.Bundle
import android.util.Log
import android.widget.EditText
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class QuizQuestionsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_questions)

        val questionsList = Constants.getQuestions()
        Log.i("Questions size", "${questionsList.size}")

        val currentPosition = 1
        val question: Question? = questionsList[currentPosition - 1]
        val progressBar: ProgressBar = findViewById(R.id.progressBar)
        val tvProgress: TextView = findViewById(R.id.tv_progress)
        val tvQuestion: TextView = findViewById(R.id.tv_question)
        val ivImage: ImageView = findViewById(R.id.iv_image)
        val tvOptionOne: EditText = findViewById(R.id.tv_option_one)
        val tvOptionTwo: EditText = findViewById(R.id.tv_option_two)
        val tvOptionThree: EditText = findViewById(R.id.tv_option_three)
        val tvOptionFour: EditText = findViewById(R.id.tv_option_four)

        progressBar.progress = currentPosition
        tvProgress.text = "$currentPosition" + "/" + progressBar.max

        tvQuestion.text = question!!.question
        ivImage.setImageResource(question.image)
        tvOptionOne.setText(question.optionOne)
        tvOptionTwo.setText(question.optionTwo)
        tvOptionThree.setText(question.optionThree)
        tvOptionFour.setText(question.optionFour)




    }
}
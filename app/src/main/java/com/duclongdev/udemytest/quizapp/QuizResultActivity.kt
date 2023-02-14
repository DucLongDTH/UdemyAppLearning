package com.duclongdev.udemytest.quizapp

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.databinding.ActivityQuizQuestionsBinding
import com.duclongdev.udemytest.databinding.ActivityQuizResultBinding
import com.duclongdev.udemytest.quizapp.constants.QuizConstants

class QuizResultActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizResultBinding

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizResultBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val userName = intent.getStringExtra(QuizConstants.USER_NAME)
        val totalQuestion = intent.getIntExtra(QuizConstants.TOTAL_QUESTION,0)
        val correctAnswer = intent.getIntExtra(QuizConstants.CORRECT_ANSWER,0)

        binding.tvName.text = userName
        binding.tvScore.text = "Score $correctAnswer of $totalQuestion"
        binding.btnFinish.setOnClickListener{
            finish()
        }

    }
}
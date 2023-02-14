package com.duclongdev.udemytest.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.duclongdev.udemytest.databinding.ActivityQuizAppStartBinding
import com.duclongdev.udemytest.quizapp.constants.QuizConstants

class QuizAppStartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizAppStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizAppStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBegin.setOnClickListener {
            if (binding.edtName.text?.isEmpty() == true) {
                Toast.makeText(this, "Please enter your name !", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(
                    Intent(this, QuizQuestionsActivity::class.java)
                        .putExtra(QuizConstants.USER_NAME, binding.edtName.text.toString())
                )
                finish()
            }
        }

    }
}
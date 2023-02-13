package com.duclongdev.udemytest.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.duclongdev.udemytest.ListTaskActivity
import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.databinding.ActivityCalculateBinding
import com.duclongdev.udemytest.databinding.ActivityQuizAppStartBinding
import kotlin.time.DurationUnit
import kotlin.time.toDuration

class QuizAppStartActivity : AppCompatActivity() {

    private lateinit var binding: ActivityQuizAppStartBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding  = ActivityQuizAppStartBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnBegin.setOnClickListener {
            if(binding.edtName.text?.isEmpty() == true){
                Toast.makeText(this,"Please enter your name !", Toast.LENGTH_SHORT).show()
            } else {
                startActivity(Intent(this, QuizQuestionsActivity::class.java))
                finish()
            }
        }

    }
}
package com.duclongdev.udemytest.quizapp

import android.annotation.SuppressLint
import android.graphics.Color
import android.graphics.Typeface
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.databinding.ActivityQuizQuestionsBinding
import com.duclongdev.udemytest.quizapp.constants.QuizConstants
import com.duclongdev.udemytest.quizapp.model.Question
import kotlinx.android.synthetic.main.activity_quiz_questions.*

class QuizQuestionsActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var binding: ActivityQuizQuestionsBinding
    private var mCurrentPost = 1
    private lateinit var mListQuestion: ArrayList<Question>
    private var mSelectedOptionPos = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizQuestionsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        mListQuestion = QuizConstants.getQuestions()
        setQuestion()
        binding.tvOptionOne.setOnClickListener(this)
        binding.tvOptionTwo.setOnClickListener(this)
        binding.tvOptionThree.setOnClickListener(this)
        binding.tvOptionFour.setOnClickListener(this)
        binding.btnSubmit.setOnClickListener(this)
    }

    @SuppressLint("SetTextI18n")
    private fun setQuestion() {
        mCurrentPost = 1
        val question = mListQuestion[mCurrentPost - 1]
        binding.progressBar.progress = mCurrentPost
        binding.tvProgress.text = "$mCurrentPost/${progressBar?.max}"
        binding.ivImageFlag.setImageResource(question.image)
        binding.tvQuestion.text = question.question
        binding.tvOptionOne.text = question.optionOne
        binding.tvOptionTwo.text = question.optionTwo
        binding.tvOptionThree.text = question.optionThree
        binding.tvOptionFour.text = question.optionFour
        if (mCurrentPost == mListQuestion.size) {
            binding.btnSubmit.text = "FINISH"
        } else {
            binding.btnSubmit.text = "SUBMIT"
        }
    }

    private fun setDefaultOptionsView() {
        val options = ArrayList<TextView>()
        binding.tvOptionOne.let {
            options.add(0, it)
        }
        binding.tvOptionTwo.let {
            options.add(1, it)
        }
        binding.tvOptionThree.let {
            options.add(2, it)
        }
        binding.tvOptionFour.let {
            options.add(3, it)
        }

        for (opt in options) {
            opt.setTextColor(Color.parseColor("#9FA8DA"))
            opt.typeface = Typeface.DEFAULT
            opt.background = ContextCompat.getDrawable(this, R.drawable.default_option_border_bg)
        }
    }

    private fun selectedOptionView(tv: TextView, selectedOptionNum: Int){
        setDefaultOptionsView()
        mSelectedOptionPos = selectedOptionNum
        tv.setTextColor(Color.parseColor("#9FA8DA"))
        tv.typeface = Typeface.DEFAULT
        tv.background = ContextCompat.getDrawable(this, R.drawable.selected_option_border_bg)
    }

    override fun onClick(v: View?) {
        when(v?.id){
            R.id.tv_option_one -> {
                selectedOptionView(binding.tvOptionOne,1)
            }
            R.id.tv_option_two -> {
                selectedOptionView(binding.tvOptionTwo,2)
            }
            R.id.tv_option_three -> {
                selectedOptionView(binding.tvOptionThree,3)
            }
            R.id.tv_option_four -> {
                selectedOptionView(binding.tvOptionFour,4)
            }
            R.id.btn_submit -> {
                // TODO "implement btn submit"
            }
        }
    }
}
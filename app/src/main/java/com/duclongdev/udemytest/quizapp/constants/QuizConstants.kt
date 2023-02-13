package com.duclongdev.udemytest.quizapp.constants

import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.quizapp.model.Question

object QuizConstants {

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        questionList.add(que1)
        return questionList
    }
}
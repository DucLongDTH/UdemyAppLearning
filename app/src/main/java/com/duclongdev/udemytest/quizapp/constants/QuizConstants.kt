package com.duclongdev.udemytest.quizapp.constants

import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.quizapp.model.Question

object QuizConstants {

    const val USER_NAME: String  = "user_name"
    const val TOTAL_QUESTION: String  = "total_questions"
    const val CORRECT_ANSWER: String  = "correct_answer"

    fun getQuestions(): ArrayList<Question> {
        val questionList = ArrayList<Question>()
        val que1 = Question(
            1,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_argentina,
            "Argentina", "Australia", "Armenia", "Austria",
            1
        )
        val que2 = Question(
            2,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_australia,
            "Viet Nam", "Australia", "NewZealand", "Austria",
            2
        )
        val que3 = Question(
            3,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_belgium,
            "Belgium", "Australia", "England", "Russia",
            1
        )
        val que4 = Question(
            4,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_brazil,
            "Argentina", "Australia", "Chile", "Brazil",
            4
        )
        val que5 = Question(
            5,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_denmark,
            "Denmark", "Sweden", "Mongolia", "Netherlands",
            1
        )
        val que6 = Question(
            6,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_fiji,
            "Cuba", "Fiji", "Papua", "Austria",
            2
        )
        val que7 = Question(
            7,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_germany,
            "Germany", "Belgium", "Armenia", "Austria",
            1
        )
        val que8 = Question(
            8,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_kuwait,
            "Kuwait", "Egypt", "Maroc", "Angola",
            1
        )
        val que9 = Question(
            9,
            "What country does this flag belong to?",
            R.drawable.ic_flag_of_india,
            "India", "Mexico", "Libya", "Sudan",
            1
        )
        questionList.add(que1)
        questionList.add(que2)
        questionList.add(que3)
        questionList.add(que4)
        questionList.add(que5)
        questionList.add(que6)
        questionList.add(que7)
        questionList.add(que8)
        questionList.add(que9)
        return questionList
    }
}
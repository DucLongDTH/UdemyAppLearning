package com.duclongdev.udemytest

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import com.duclongdev.udemytest.quizapp.QuizAppStartActivity
import kotlinx.android.synthetic.main.activity_list_task.*

class ListTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_task)
        val arrayAdapter: ArrayAdapter<*>
        val tasks = arrayOf(
            "Calculate Age",
            "Calculate Machine",
            "Quiz App",
        )
        arrayAdapter = ArrayAdapter(this, R.layout.item_list_task, tasks)
        lv_task.adapter = arrayAdapter
        lv_task.setOnItemClickListener { parrent, view, position, id ->
            when (arrayAdapter.getItem(position)) {
                "Calculate Age" -> {
                    startActivity(Intent(this, CalculateAgeActivity::class.java))
                }
                "Calculate Machine" -> {
                    startActivity(Intent(this, CalculateMachineActivity::class.java))
                }
                "Quiz App" -> {
                    startActivity(Intent(this, QuizAppStartActivity::class.java))
                }
                else -> {}
            }
        }
    }
}
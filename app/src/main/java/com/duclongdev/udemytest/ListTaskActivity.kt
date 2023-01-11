package com.duclongdev.udemytest

import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_list_task.*

class ListTaskActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list_task)
        val arrayAdapter: ArrayAdapter<*>
        val tasks = arrayOf(
            "App 1",
            "App 2",
            "App 3",
            "App 4",
            "App 5",
            "App 6",
            "App 7",
            "App 8",
            "App 9",
            "App 10",
            "App 1",
            "App 2",
            "App 3",
            "App 4",
            "App 5",
            "App 6",
            "App 7",
            "App 8",
            "App 9",
            "App 10"
        )
        arrayAdapter = ArrayAdapter(this, R.layout.item_list_task, tasks)
        lv_task.adapter = arrayAdapter
    }
}
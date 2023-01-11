package com.duclongdev.udemytest

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_go.setOnClickListener{
            Log.d("LogD","on tap button hi hi")
            startActivity(Intent(this, ListTaskActivity::class.java))
        }
    }

}
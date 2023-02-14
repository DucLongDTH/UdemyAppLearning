package com.duclongdev.udemytest.kiddrawingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.databinding.ActivityKidDrawingAppMainBinding

class KidDrawingAppMain : AppCompatActivity() {
    private lateinit var binding: ActivityKidDrawingAppMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKidDrawingAppMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

}
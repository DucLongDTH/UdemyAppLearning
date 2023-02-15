package com.duclongdev.udemytest.kiddrawingapp

import android.app.Dialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.duclongdev.udemytest.R
import com.duclongdev.udemytest.databinding.ActivityKidDrawingAppMainBinding
import kotlinx.android.synthetic.main.dialog_brush_size.*

class KidDrawingAppMain : AppCompatActivity() {
    private lateinit var binding: ActivityKidDrawingAppMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityKidDrawingAppMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.drPaint.setBrushSize(10.toFloat())

        binding.ibBrushChoose.setOnClickListener {
            showBrushSizeChooserDialog()
        }
    }

    private fun showBrushSizeChooserDialog(){
        val brushDialog = Dialog(this)
        brushDialog.setContentView(R.layout.dialog_brush_size)
        brushDialog.ib_small_brush.setOnClickListener {
            binding.drPaint.setBrushSize(10.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.ib_medium_brush.setOnClickListener {
            binding.drPaint.setBrushSize(20.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.ib_large_brush.setOnClickListener {
            binding.drPaint.setBrushSize(30.toFloat())
            brushDialog.dismiss()
        }
        brushDialog.show()
    }
}
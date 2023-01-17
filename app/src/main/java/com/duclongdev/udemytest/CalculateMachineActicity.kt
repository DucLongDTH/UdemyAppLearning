package com.duclongdev.udemytest

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.duclongdev.udemytest.databinding.ActivityCalculateBinding

class CalculateMachineActivity: AppCompatActivity() {
    private lateinit var binding: ActivityCalculateBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initOnClickView()
    }

    private fun initOnClickView() {
        binding.btnZero.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnOne.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnTwo.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnThree.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnFour.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnFive.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnSix.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnSeven.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnEight.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnNine.setOnClickListener{ view ->
            appendTextInTextView(view)
        }
        binding.btnClear.setOnClickListener{ view ->
            binding.tvCalc.text = ""
        }
    }

    private fun appendTextInTextView(view: View?) {
        binding.tvCalc.append((view as Button).text)
    }


}
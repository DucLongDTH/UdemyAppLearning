package com.duclongdev.udemytest

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.duclongdev.udemytest.databinding.ActivityCalculateBinding

class CalculateMachineActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCalculateBinding
    private var lastNumeric = false
    private var lastDot = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCalculateBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initOnClickView()
    }

    private fun initOnClickView() {
        binding.btnZero.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnOne.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnTwo.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnThree.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnFour.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnFive.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnSix.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnSeven.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnEight.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnNine.setOnClickListener { view ->
            appendTextInTextView(view)
        }
        binding.btnClear.setOnClickListener { view ->
            binding.tvCalc.text = ""
        }
        binding.btnDot.setOnClickListener { view ->
            onDecimalPoint(view)
        }
        binding.btnPlus.setOnClickListener {
            onOperator(it)
        }
        binding.btnDivider.setOnClickListener {
            onOperator(it)
        }
        binding.btnSubtract.setOnClickListener {
            onOperator(it)
        }
        binding.btnMultiply.setOnClickListener {
            onOperator(it)
        }
        binding.btnCalc.setOnClickListener {
            onEqual(it)
        }
    }

    private fun appendTextInTextView(view: View?) {
        binding.tvCalc.append((view as Button).text)
        lastNumeric = true
        lastDot = false
    }

    private fun onDecimalPoint(view: View?) {
        if (lastNumeric && !lastDot) {
            binding.tvCalc.append(".")
            lastNumeric = false
            lastDot = true
        }
    }

    private fun onOperator(view: View?) {
        binding.tvCalc.text?.let { rs ->
            if (lastNumeric && !isOperatorAdded(rs.toString())) {
                binding.tvCalc.append((view as Button).text)
                lastNumeric = false
                lastDot = false
            }
        }
    }

    private fun isOperatorAdded(value: String): Boolean {
        return if (value.startsWith("-")) {
            false
        } else {
            value.contains("/") || value.contains("+") || value.contains("*") || value.contains("-")
        }
    }

    @SuppressLint("SetTextI18n")
    private fun onEqual(view: View?) {
        if (lastNumeric) {
            var tvValue = binding.tvCalc.text.toString()
            var prefix = ""
            try {
                if (tvValue.startsWith("-")) {
                    prefix = "-"
                    tvValue = tvValue.substring(1)
                }
                if (tvValue.contains("-")) {
                    val splitValue = tvValue.split("-")
                    var numberOne = splitValue[0]
                    val numberTwo = splitValue[1]
                    if (prefix.isNotEmpty()) {
                        numberOne = prefix + numberOne
                    }
                    binding.tvCalc.text = removeZeroDouble((numberOne.toDouble() - numberTwo.toDouble()).toString())
                } else if (tvValue.contains("+")) {
                    val splitValue = tvValue.split("+")
                    var numberOne = splitValue[0]
                    val numberTwo = splitValue[1]
                    if (prefix.isNotEmpty()) {
                        numberOne = prefix + numberOne
                    }
                    binding.tvCalc.text = removeZeroDouble((numberOne.toDouble() + numberTwo.toDouble()).toString())
                } else if (tvValue.contains("*")) {
                    val splitValue = tvValue.split("*")
                    var numberOne = splitValue[0]
                    val numberTwo = splitValue[1]
                    if (prefix.isNotEmpty()) {
                        numberOne = prefix + numberOne
                    }
                    binding.tvCalc.text = removeZeroDouble((numberOne.toDouble() * numberTwo.toDouble()).toString())
                } else if (tvValue.contains("/")) {
                    val splitValue = tvValue.split("/")
                    var numberOne = splitValue[0]
                    val numberTwo = splitValue[1]
                    if (prefix.isNotEmpty()) {
                        numberOne = prefix + numberOne
                    }
                    if (numberTwo == "0") {
                        binding.tvCalc.text = "Cant not divide to zero"
                    } else
                        binding.tvCalc.text = removeZeroDouble((numberOne.toDouble() / numberTwo.toDouble()).toString())
                }
            } catch (e: ArithmeticException) {
                e.printStackTrace()
            }
        }
    }

    private fun removeZeroDouble(result: String): String {
        var value = result
        if (value.contains(".0"))
            value = value.substring(0, value.length - 2)
        return value
    }
}
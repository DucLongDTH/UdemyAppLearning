package com.duclongdev.udemytest

import android.annotation.SuppressLint
import android.app.DatePickerDialog
import android.os.Bundle
import com.google.android.material.snackbar.Snackbar
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import com.duclongdev.udemytest.databinding.ActivityCalculateAgeBinding
import java.text.SimpleDateFormat
import java.util.*

class CalculateAgeActivity : AppCompatActivity() {

    //    private lateinit var appBarConfiguration: AppBarConfiguration
    private lateinit var binding: ActivityCalculateAgeBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculateAgeBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.buttonCalculate.setOnClickListener {
            selectDate()
        }

//        setSupportActionBar(binding.toolbar)
//
//        val navController = findNavController(R.id.nav_host_fragment_content_calculate_age)
//        appBarConfiguration = AppBarConfiguration(navController.graph)
//        setupActionBarWithNavController(navController, appBarConfiguration)
//
//        binding.fab.setOnClickListener { view ->
//            Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
//                .setAction("Action", null).show()
//        }
    }

    @SuppressLint("SetTextI18n")
    private fun selectDate() {
        val c = Calendar.getInstance()
        val year = c.get(Calendar.YEAR)
        val month = c.get(Calendar.MONTH)
        val day = c.get(Calendar.DAY_OF_MONTH)
        val dpd = DatePickerDialog(this, { _, yearSelected, monthOfYear, dayOfMonth ->
            binding.tvDate.text = "$dayOfMonth" + "/" + (monthOfYear + 1) + "/" + yearSelected
            val sdf = SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH)
            val dateSelected = sdf.parse(
                "$dayOfMonth/${monthOfYear + 1}/$yearSelected"
            )
            val dateSelectedInMinutes = (dateSelected?.time ?: 1) / 60000
            val currentDateInMinutes = (sdf.parse(sdf.format(System.currentTimeMillis()))?.time ?: 1) / 60000
            val differenceInMinutes = currentDateInMinutes - dateSelectedInMinutes
            binding.tvMinutes.text = differenceInMinutes.toString()

        }, year, month, day)
        dpd.datePicker.maxDate = Date().time
        dpd.show()
    }

//    override fun onSupportNavigateUp(): Boolean {
//        val navController = findNavController(R.id.nav_host_fragment_content_calculate_age)
//        return navController.navigateUp(appBarConfiguration)
//                || super.onSupportNavigateUp()
//    }
}
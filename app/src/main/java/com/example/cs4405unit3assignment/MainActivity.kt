package com.example.cs4405unit3assignment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val weightEditText: EditText = findViewById(R.id.weightEditText)
        val heightEditText: EditText = findViewById(R.id.heightEditText)
        val genderEditText: EditText = findViewById(R.id.gender)
        val calculateButton: Button = findViewById(R.id.calcBtn)

        calculateButton.setOnClickListener {
            val weight = weightEditText.text.toString().toDoubleOrNull()
            val height = heightEditText.text.toString().toDoubleOrNull()
            val genderString = genderEditText.text.toString()

            if (weight != null && height != null && genderString.isNotBlank()) {
                val gender = when (genderString.trim().lowercase()) {
                    "male" -> Gender.MALE
                    "female" -> Gender.FEMALE
                    else -> Gender.OTHER
                }

                val userData = UserData(weight, height, gender)

                val bmiCalculator = BMICalculator()
                val bmi = bmiCalculator.calculateBMI(userData)

                println(bmi)
            } else {
                // Handle cases where weight, height, or gender is not valid
                // Show an error message, for example
            }
        }

        fun displayResults(bmi: Double) {
            // Implement UI update logic based on BMI categories
            // Use TextView or other UI elements to display results
        }



    }
}
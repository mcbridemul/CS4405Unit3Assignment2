package com.example.cs4405unit3assignment

class BMICalculator {
    fun calculateBMI(userData: UserData): Double {
        // BMI calculation logic based on weight and height
        // BMI = weight (kg) / (height (m) * height (m))
        return userData.weight / (userData.height * userData.height)
    }
}
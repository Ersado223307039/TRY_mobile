package com.example.contohuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FourthActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var calculateCelciusButton: Button
    private lateinit var calculateFahrenheitButton: Button
    private lateinit var calculateKelvinButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)

        numberEditText = findViewById(R.id.editTextNumberr)
        calculateCelciusButton = findViewById(R.id.calculateCelciusBtn)
        calculateFahrenheitButton = findViewById(R.id.calculateFahrenheitBtn)
        calculateKelvinButton = findViewById(R.id.calculateKelvinBtn)
        resetButton = findViewById(R.id.ResetBtn)
        resultTextView = findViewById(R.id.Hasill)

        calculateCelciusButton.setOnClickListener {
            calculateCelcius()
        }
        calculateFahrenheitButton.setOnClickListener {
            calculateFahrenheit()
        }
        calculateKelvinButton.setOnClickListener {
            calculateKelvin()
        }
        resetButton.setOnClickListener{
            resetInputs()
        }
    }

    private fun calculateCelcius() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = number * 5 / 4
        resultTextView.text = "Hasil persentasenya: $result °C"
    }

    private fun calculateFahrenheit() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number * 9 / 4) + 32
        resultTextView.text = "Hasil persentasenya: $result °F"
    }

    private fun calculateKelvin() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number * 5 / 4) + 273.15
        resultTextView.text = "Hasil persentasenya: $result °K"
    }

    private fun resetInputs() {
        numberEditText.text.clear()
    }
}
package com.example.contohuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class SixthActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var calculateCelciusButton: Button
    private lateinit var calculateReamurButton: Button
    private lateinit var calculateFahrenheitButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultTextView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)

        numberEditText = findViewById(R.id.editTextNumberr)
        calculateCelciusButton = findViewById(R.id.calculateCelciusBtn)
        calculateReamurButton = findViewById(R.id.calculateReamurBtn)
        calculateFahrenheitButton = findViewById(R.id.calculateFahrenheitBtn)
        resetButton = findViewById(R.id.ResetBtn)
        resultTextView = findViewById(R.id.Hasill)

        calculateCelciusButton.setOnClickListener {
            calculateCelcius()
        }
        calculateReamurButton.setOnClickListener {
            calculateReamur()
        }
        calculateFahrenheitButton.setOnClickListener {
            calculateFahrenheit()
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

        val result = number - 273.15
        resultTextView.text = "Hasil persentasenya: $result °C"
    }

    private fun calculateReamur() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number - 273.15) * 4 / 5
        resultTextView.text = "Hasil persentasenya: $result °R"
    }

    private fun calculateFahrenheit() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number - 273.15) * 9 / 5 + 32
        resultTextView.text = "Hasil persentasenya: $result °F"
    }

    private fun resetInputs() {
        numberEditText.text.clear()
    }
}
package com.example.contohuas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class FifthActivity : AppCompatActivity() {
    private lateinit var numberEditText: EditText
    private lateinit var calculateCelciusButton: Button
    private lateinit var calculateReamurButton: Button
    private lateinit var calculateKelvinButton: Button
    private lateinit var resetButton: Button
    private lateinit var resultTextView: TextView


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)

        numberEditText = findViewById(R.id.editTextNumberr)
        calculateCelciusButton = findViewById(R.id.calculateCelciusBtn)
        calculateReamurButton = findViewById(R.id.calculateReamurBtn)
        calculateKelvinButton = findViewById(R.id.calculateKelvinBtn)
        resetButton = findViewById(R.id.ResetBtn)
        resultTextView = findViewById(R.id.Hasill)

        calculateCelciusButton.setOnClickListener {
            calculateCelcius()
        }
        calculateReamurButton.setOnClickListener {
            calculateReamur()
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

        val result = (number - 32) * 5/9
        resultTextView.text = "Hasil persentasenya: $result °C"
    }

    private fun calculateReamur() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number - 32) * 4 /9
                resultTextView.text = "Hasil persentasenya: $result °R"
    }

    private fun calculateKelvin() {
        val numberInput = numberEditText.text.toString()

        if (numberInput.isEmpty() ) {
            Toast.makeText(this, "Input number atau percentage kosong", Toast.LENGTH_SHORT).show()
            return
        }
        val number = numberEditText.text.toString().toInt()

        val result = (number + 456.67) * 5/9
        resultTextView.text = "Hasil persentasenya: $result °K"
    }

    private fun resetInputs() {
        numberEditText.text.clear()
    }
}
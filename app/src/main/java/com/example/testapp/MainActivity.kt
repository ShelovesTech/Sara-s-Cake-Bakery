package com.example.testapp


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val numberOfCakesTextView = findViewById<TextView>(R.id.tvNumbers)
        val inputField = findViewById<EditText>(R.id.etNumber)
        val quantityTextView = findViewById<TextView>(R.id.tvQuantity2)
        val radioField = findViewById<RadioButton>(R.id.rbSize)
        val radioField2 = findViewById<RadioButton>(R.id.rbSize2)
        val radioField3 = findViewById<RadioButton>(R.id.rbSize3)
        val radioField4 = findViewById<RadioButton>(R.id.rbSize4)
        val paymentTextView = findViewById<TextView>(R.id.tvPayment)
        val radioButton2 = findViewById<RadioButton>(R.id.radioButton2)
        val radioButton3 = findViewById<RadioButton>(R.id.radioButton3)
        val radioButton4 = findViewById<RadioButton>(R.id.radioButton4)
        val orderButton = findViewById<Button>(R.id.btnOrder)
        orderButton.setOnClickListener {
            val enteredAmount = inputField.text.toString()
            val message = "Order $enteredAmount"
            numberOfCakesTextView.text = message
        }




    }
}
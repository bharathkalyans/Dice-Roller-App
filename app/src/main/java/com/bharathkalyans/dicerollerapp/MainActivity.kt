package com.bharathkalyans.dicerollerapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val rollButton : Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener {
            rollDice()

            Toast.makeText(this, " Random Number Generated", Toast.LENGTH_SHORT)
        }
    }


    private fun rollDice() {

        var resultText: TextView = findViewById(R.id.resultText)

        var randomNumber = Random.nextInt(6) + 1

        resultText.text = randomNumber.toString()


    }
}
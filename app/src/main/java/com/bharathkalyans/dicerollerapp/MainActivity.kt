package com.bharathkalyans.dicerollerapp

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.renderscript.ScriptGroup
import android.widget.Button

class MainActivity : AppCompatActivity() {




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)





        val rollButton : Button = findViewById<Button>(R.id.roll_button)
        rollButton.text = "Lets Roll!"

    }
}
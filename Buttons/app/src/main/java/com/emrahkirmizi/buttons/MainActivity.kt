package com.emrahkirmizi.buttons

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.annotation.ColorInt
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {
    lateinit var doMagic : Button
    lateinit var myButton : Button
    lateinit var myText : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        doMagic = findViewById(R.id.doMagic)
        myButton = findViewById(R.id.myButton)
        myText = findViewById(R.id.textViewExample)

        doMagic.setOnClickListener {
            doMagic.setBackgroundColor(Color.RED)
            myText.setText("I have done my magic.")
            myText.isVisible = false
            myButton.isVisible = true
        }

        myButton.setOnClickListener {
            myText.isVisible = true
            doMagic.isVisible = true
        }

    }
}
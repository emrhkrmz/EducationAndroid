package com.emrahkirmizi.viewbinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.emrahkirmizi.viewbinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var mainBinding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        mainBinding = ActivityMainBinding.inflate(layoutInflater)
        //tasarımı aktarmak istediğimizde kullanırız
        val view = mainBinding.root

        //setContentView(R.layout.activity_main)
        setContentView(view)

        mainBinding.buttonOk.setOnClickListener {

            mainBinding.textViewResult.text = mainBinding.editTextName.text.toString()

        }


    }
}
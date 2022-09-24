package com.emrahkirmizi.lifecycles

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("Message","onCreate")

    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Message","onDestroy")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Message","onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Message","onStop")
    }

    override fun onStart() {
        super.onStart()
        Log.d("Message","onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Message","onResume")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Message","onRestart")
    }

}
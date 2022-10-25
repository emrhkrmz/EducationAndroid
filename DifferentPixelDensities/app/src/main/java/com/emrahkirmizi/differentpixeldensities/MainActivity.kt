package com.emrahkirmizi.differentpixeldensities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar!!.setDisplayShowCustomEnabled(true)
        supportActionBar!!.setLogo(R.mipmap.logo_image_bird)
        supportActionBar!!.setDisplayUseLogoEnabled(true)

        setContentView(R.layout.activity_main)
    }
}
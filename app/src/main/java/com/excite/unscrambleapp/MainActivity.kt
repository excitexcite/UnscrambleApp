package com.excite.unscrambleapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

/**
 * Creates an Activity that hosts the Game fragment in the app
 */
class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
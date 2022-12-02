package com.esgi.android.exercices

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // décommenter pour switch entre les 2 layout développer
        //setContentView(R.layout.my_booking)
        // setContentView(R.layout.parking_receipt)
    }
}
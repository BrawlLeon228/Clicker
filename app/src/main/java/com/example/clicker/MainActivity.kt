package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var button1 = findViewById<Button>(R.id.button)
        button1.setOnClickListener {
            val perehod = Intent(this, EgraActivity::class.java)
            startActivity(perehod)
        }

    }



}
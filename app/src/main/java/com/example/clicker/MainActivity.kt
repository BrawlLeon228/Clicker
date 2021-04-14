package com.example.clicker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tap = findViewById<Button>(R.id.button8)

        tap.setOnClickListener { v ->
            val perehod = Intent(this, EgraActivity::class.java)
            startActivity(perehod)
            v.setBackgroundColor(Color.GRAY)
            }
        }

    }
package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class start : AppCompatActivity() {
    val start : Button by lazy { findViewById<Button>(R.id.buttonstart) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)

        start.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }

    }
    }

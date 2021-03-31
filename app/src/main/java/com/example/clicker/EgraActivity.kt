package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView

class EgraActivity : AppCompatActivity() {
    var int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egra)
        val button1 = findViewById<ImageButton>(R.id.button2)
        val buttonExit = findViewById<Button>(R.id.button4)
        val text1 = findViewById<TextView>(R.id.textView1)

        buttonExit.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }


        button1.setOnClickListener {
            int += 10
            text1.text = int.toString()
        }

    }
}
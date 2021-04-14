package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Shop : AppCompatActivity() {
    val buttonlefttop : Button by lazy { findViewById<Button>(R.id.button6) }
    val buttonmiddletop : Button by lazy { findViewById<Button>(R.id.button7) }
    val buttonrighttop : Button by lazy { findViewById<Button>(R.id.button8) }
    val buttonexit : Button by lazy { findViewById<Button>(R.id.button9) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_shop)

        buttonlefttop.setOnClickListener {
            Data.vid = 2
        }
        buttonmiddletop.setOnClickListener {
            Data.vid = 3
        }
        buttonrighttop.setOnClickListener {
            Data.vid = 5
        }
        buttonexit.setOnClickListener {
            val back = Intent(this, EgraActivity::class.java)
            startActivity(back)
        }
    }


}
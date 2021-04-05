package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class EgraActivity : AppCompatActivity() {

    val button1 : ImageButton by lazy { findViewById(R.id.button2) }
    val buttonExit: Button by lazy { findViewById<Button>(R.id.button4) }
    val text1 : TextView by lazy {  findViewById(R.id.textView1)}

    var plus1 = 1000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egra)
        var int = 0




        buttonExit.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }


        button1.setOnClickListener {

            int += plus1
            text1.text = int.toString()


        }

    }

    override fun onSaveInstanceState(outState: Bundle, outPersistentState: PersistableBundle) {
        outState.putInt("key", text1.text.toString().toInt())

        super.onSaveInstanceState(outState, outPersistentState)

    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        text1.text = savedInstanceState.getInt("key").toString()
        super.onRestoreInstanceState(savedInstanceState)
    }

}
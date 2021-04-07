package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView


class EgraActivity : AppCompatActivity() {
    var vid1 = 1
    val button1 : ImageButton by lazy { findViewById<ImageButton>(R.id.button2) }
    val buttonExit: Button by lazy { findViewById<Button>(R.id.button4) }
    val text1 : TextView by lazy {  findViewById<TextView>(R.id.textView1)}
    val shop : Button by lazy { findViewById<Button>(R.id.button5)}

    var plus1 = vid1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egra)
        var int = 0
        var shop = findViewById<Button>(R.id.button5)



        buttonExit.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }
        shop.setOnClickListener {
            val go = Intent(this, Shop::class.java)
            startActivity(go)
        }




        shop.setOnClickListener {
            val anime = AnimationUtils.loadAnimation(this,R.anim.miganie)
            shop.startAnimation(anime)
        }
        button1.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this,R.anim.yvelichenie)
            button1.startAnimation(anim)

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
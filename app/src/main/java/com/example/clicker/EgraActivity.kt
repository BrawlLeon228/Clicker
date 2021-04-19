package com.example.clicker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView


class EgraActivity : AppCompatActivity() {


    val button1 : ImageButton by lazy { findViewById<ImageButton>(R.id.button2) }
    val buttonExit: Button by lazy { findViewById<Button>(R.id.button4) }
    val text1 : TextView by lazy {  findViewById<TextView>(R.id.textView1)}
    val shop : Button by lazy { findViewById<Button>(R.id.button5)}
    var plus1 = Data.vid



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_egra)
        var int = 0


        buttonExit.setOnClickListener {
            val perehod = Intent(this, MainActivity::class.java)
            startActivity(perehod)
        }


        shop.setOnClickListener {
            val anime = AnimationUtils.loadAnimation(this,R.anim.miganie)
            val go = Intent(this, Shop::class.java)
            shop.startAnimation(anime)
            anime.setAnimationListener(object : Animation.AnimationListener {
                override fun onAnimationStart(p0: Animation?) {   }
                override fun onAnimationEnd(p0: Animation?) {
                    startActivity(go)
                }
                override fun onAnimationRepeat(p0: Animation?) { }
            })
        }

        button1.setOnClickListener {
            val anim = AnimationUtils.loadAnimation(this,R.anim.yvelichenie)
            button1.startAnimation(anim)

            int += plus1
            text1.text = int.toString()



        }
        Data.money = int
    }


}
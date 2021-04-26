package com.example.clicker

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView
import androidx.core.content.ContextCompat.startActivity
import androidx.fragment.app.Fragment


class EgraActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.activity_egra, container, false)


        val button1 =root.findViewById<ImageButton>(R.id.button2)
        val buttonExit= root.findViewById<Button>(R.id.button4)
        val text1 =  root.findViewById<TextView>(R.id.textView1)
        text1.text = Data.money.toString()
        val shop =root.findViewById<Button>(R.id.button5)

        buttonExit.setOnClickListener {
            val perehod = Intent(requireContext(), start::class.java)
            startActivity(perehod)
        }

        shop.setOnClickListener {
            val anime = AnimationUtils.loadAnimation(requireContext(),R.anim.miganie)
            val go = Intent(requireContext(), Shop::class.java)
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
            val anim = AnimationUtils.loadAnimation(requireContext(),R.anim.yvelichenie)
            button1.startAnimation(anim)

            Data.money += Data.vid
            text1.text = Data.money.toString()



        }


        return root

        }}
















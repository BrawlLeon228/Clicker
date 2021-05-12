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
import com.google.android.material.snackbar.Snackbar


class EgraActivity : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.shop, container, false)


        var a = 0
        val button1 =root.findViewById<ImageButton>(R.id.button2)
        val text1 =  root.findViewById<TextView>(R.id.textView1)
        text1.text = "${Data.money}$"



        button1.setOnClickListener {
            a += 1
            if (a >= 1000){
                val d = (1..1000).random()
                if (d in 1..5){
                    Snackbar.make(requireView(), "Вас заметило правительство -300$", Snackbar.LENGTH_LONG).show()
                    Data.money -= 300
                }
            }
            val anim = AnimationUtils.loadAnimation(requireContext(),R.anim.yvelichenie)
            button1.startAnimation(anim)

            Data.money += Data.vid
            text1.text = "${Data.money}$"



        }


        return root

        }}
















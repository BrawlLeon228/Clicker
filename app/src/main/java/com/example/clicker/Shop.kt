package com.example.clicker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class Shop : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {


        val root = inflater.inflate(R.layout.activity_shop, container, false)
        val buttonlefttop =root.findViewById<Button>(R.id.button6)
        val buttonmiddletop= root.findViewById<Button>(R.id.button7)
        val buttonrighttop = root.findViewById<Button>(R.id.button8)
        val buttonexit = root.findViewById<Button>(R.id.button9)


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
            val back = Intent(requireContext(), EgraActivity::class.java)
            startActivity(back)
        }
        return root
    }






}
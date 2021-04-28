package com.example.clicker

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import androidx.fragment.app.Fragment
import com.google.android.material.snackbar.Snackbar

class Shop : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        val root = inflater.inflate(R.layout.game, container, false)
        val buttonlefttop =root.findViewById<Button>(R.id.button6)
        val buttonmiddletop= root.findViewById<Button>(R.id.button7)
        val buttonrighttop = root.findViewById<Button>(R.id.button8)
        val mon : TextView = root.findViewById<TextView>(R.id.textView5)
        mon.text = "${Data.money.toString()}$"
//        var m = Data.money




        buttonlefttop.setOnClickListener {

            if (Data.money >= 200){
                Data.money -= 200
                Data.vid = 2

            }
            else
                Snackbar.make(requireView(), "У вас недостаточно денег",Snackbar.LENGTH_LONG).show()

        }
        buttonmiddletop.setOnClickListener {

            if (Data.money >= 1000){
                Data.money -= 1000
                Data.vid = 3
            }
            else
                Snackbar.make(requireView(), "у вас недостаточно денег",Snackbar.LENGTH_LONG).show()

        }
        buttonrighttop.setOnClickListener {

            if (Data.money >= 5000){
                Data.money -= 5000
                Data.vid = 5
            }
            else
                Snackbar.make(requireView(), "у вас недостаточно денег",Snackbar.LENGTH_LONG).show()

        }


        return root
    }






}
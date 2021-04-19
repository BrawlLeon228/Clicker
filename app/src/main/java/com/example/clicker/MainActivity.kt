package com.example.clicker

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
//        var tap = findViewById<Button>(R.id.button8)
//
//        tap.setOnClickListener { v ->
//            val perehod = Intent(this, EgraActivity::class.java)
//            startActivity(perehod)
//            v.setBackgroundColor(Color.GRAY)
//            }


        val g: BottomNavigationView = findViewById(R.id.nav_view)

        val nc = findNavController(R.id.nav_host_fragment)

        val abc = AppBarConfiguration(setOf(
            R.id.egraActivity, R.id.shop))
        setupActionBarWithNavController(nc, abc)
        g.setupWithNavController(nc)
        }

    }
package com.onshop.bottomnavigationmultistack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findViewById<BottomNavigationView>(R.id.bottom_navigation).apply {
            val navController = findNavController(R.id.my_nav_host_fragment)
            setupWithNavController(navController)
            setOnNavigationItemReselectedListener { }
        }
    }
}
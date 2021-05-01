package com.onshop.bottomnavigationmultistack

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        if (savedInstanceState == null) {
            val navGraphIds = listOf(
                R.navigation.navigation_a,
                R.navigation.navigation_b,
                R.navigation.navigation_c
            )
            findViewById<BottomNavigationView>(R.id.bottom_navigation).setupWithNavController(
                navGraphIds,
                supportFragmentManager,
                R.id.fragmentContainer,
                intent
            )
        }
    }
}
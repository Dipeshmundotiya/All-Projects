package com.example.swipableviews

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        val images = listOf(
            R.drawable.wall,
            R.drawable.france,
            R.drawable.japan,
            R.drawable.spain,
            R.drawable.england,
            R.drawable.germany,
            R.drawable.diceimage,
            R.drawable.iiitlogo,
            R.drawable.sihlogo
        )
        val adapter = ViewPagerAdapter(images)
        val viewpager = findViewById<ViewPager2>(R.id.viewpager)
        viewpager.adapter = adapter
    }
}
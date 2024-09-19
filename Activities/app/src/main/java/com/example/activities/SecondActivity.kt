package com.example.activities

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class SecondActivity: AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
setContentView(R.layout.secondactivity)

        val backbtn= findViewById<Button>(R.id.backbtn)
        backbtn.setOnClickListener {
            finish()
        }
        val newactivity = findViewById<Button>(R.id.thirdactivity)
        newactivity.setOnClickListener {
            Intent(this,MainActivity3::class.java).also {
                startActivity(it)
            }
        }
    }
}
package com.example.luckynumber

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Activity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var text : TextView =  findViewById(R.id.text)
        text.setText("Your lucky number is "+randomnum())
        var btn : Button = findViewById(R.id.button)
        btn.setOnClickListener()
        {

            var i : Intent = Intent(Intent.ACTION_VIEW)
            i.setData(Uri.parse("https://www.youtube.com/"))
            startActivity(i)
        }

    }

    fun randomnum(): Int{
        var i = java.util.Random().nextInt( 100)+1
        return i
    }
}
package com.example.explicitintent

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main2)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        //receiving data from activity
        val bundle : Bundle?= intent.extras
        var nam = bundle?.getInt("name")
        Toast.makeText(this,"your name is "+nam,Toast.LENGTH_LONG).show()

        //implicit intent example
        var btn:Button=findViewById(R.id.button)
        btn.setOnClickListener()
        {
            var inten : Intent = Intent(Intent.ACTION_VIEW)
            inten.setData(Uri.parse("https://www.udemy.com/course/mastering-android-app-development-with-kotlin-build-38-apps/learn/lecture/34633824#reviews"))
            startActivity(inten)
        }
    }

}
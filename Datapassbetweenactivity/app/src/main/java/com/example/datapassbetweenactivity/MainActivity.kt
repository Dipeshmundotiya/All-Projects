package com.example.datapassbetweenactivity

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
        var etname = findViewById<EditText>(R.id.etname)
        var etage = findViewById<EditText>(R.id.etage)
        var etcountry = findViewById<EditText>(R.id.etcountry)
        var etresult = findViewById<TextView>(R.id.reulttext)
        val click = findViewById<Button>(R.id.click)

        click.setOnClickListener {
            var name = etname.text.toString()
            var age = etage.text.toString().toInt()
            var country = etcountry.text.toString()
            Intent(this,MainActivity2::class.java).also {
                it.putExtra("NAME",name)
                it.putExtra("AGE",age)
                it.putExtra("COUNTRY",country)
                startActivity(it)
            }
            var rst = "My name is  $name and my age is $age and i lived in $country "
            etresult.text = rst
        }




    }
}
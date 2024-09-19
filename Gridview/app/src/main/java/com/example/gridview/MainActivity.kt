package com.example.gridview

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.GridView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

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
        val gridView = findViewById<GridView>(R.id.gridView)
        var flowername = arrayOf(
            "Rose ", " jasmin","puspa","kamal","lily","sunflower","tulip"
        )
        var image = intArrayOf(
            R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,R.drawable.g

        )
        val gridAdaptor = gridAdaptor(this@MainActivity, flowername, image )
        gridView.adapter
        gridView.setOnItemClickListener(
            fun (parent : AdapterView<*>?, view: View?,position : Int, id : Long){
                Toast.makeText(this@MainActivity,"You clicked on "+flowername[position],Toast.LENGTH_LONG).show()
            }
        )

    }
}
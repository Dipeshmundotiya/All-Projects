package com.example.recyclerview

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

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

        var todoList = mutableListOf(
            ToDo("Follo AndroidDevs",false),
            ToDo("Learn recyclerview",false),
            ToDo("Fragments",false),
            ToDo("tab layout",false),
            ToDo("Activity lifecycle",false),
            ToDo("menu",false),
            ToDo("navigation bar",false),
            ToDo("swipable view",false),
            ToDo("Jetpack compose",false),
            ToDo("Data storage",false),
            ToDo("A big project",false)
        )
        val adapter = Adapter(todoList)
val recyclertodo = findViewById<RecyclerView>(R.id.recyclertodo)
        recyclertodo.adapter = adapter
        recyclertodo.layoutManager = LinearLayoutManager(this)
        val btn = findViewById<Button>(R.id.btn)
        btn.setOnClickListener {
            val edittodo = findViewById<EditText>(R.id.edittodo)
            val title = edittodo.text.toString()
            val todo = ToDo(title,false)
            todoList.add(todo)
            adapter.notifyItemInserted(todoList.size-1)
        }
    }
}
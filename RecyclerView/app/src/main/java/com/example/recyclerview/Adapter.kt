package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CheckBox
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter(
    var todos: List<ToDo>
) : RecyclerView.Adapter<Adapter.ToDoviewHolder>() {
    inner class ToDoviewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoviewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_todo, parent, false)
        return ToDoviewHolder(view)
    }

    override fun onBindViewHolder(holder: ToDoviewHolder, position: Int) {
        holder.itemView.apply {
            val texttodo = findViewById<TextView>(R.id.Texttodo)
            texttodo.text = todos[position].title
            var checkbtn = findViewById<CheckBox>(R.id.checkbtn)
            checkbtn.isChecked = todos[position].isChecked
        }
    }

    override fun getItemCount(): Int {
        return todos.size
    }
}
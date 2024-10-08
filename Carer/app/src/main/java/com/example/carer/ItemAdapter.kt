package com.example.carer

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter(private val listMember: List<ItemModel>) :RecyclerView.Adapter<ItemAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.ViewHolder {
     val inflater = LayoutInflater.from(parent.context)
        val item = inflater.inflate(R.layout.item_member,parent,false)
        return ViewHolder(item)
    }

    override fun onBindViewHolder(holder: ItemAdapter.ViewHolder, position: Int) {
    val item = listMember[position]
        holder.name.text = item.name
    }

    override fun getItemCount(): Int {
      return listMember.size
    }

    class ViewHolder(private  val item : View):RecyclerView.ViewHolder(item) {
       val imageUser = item.findViewById<ImageView>(R.id.userimage)
        val name = item.findViewById<TextView>(R.id.username)
    }
}
package com.example.androidcompetition

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ItemViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

}
class MyAdapter(val items: List<Item>) : RecyclerView.Adapter<ItemViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item, parent, false))
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return items.size
    }
}
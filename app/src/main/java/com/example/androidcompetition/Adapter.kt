package com.example.androidcompetition

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class NViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

}
class NAdapter(val list: List<Item>, onClickItem: OnClickItem) : RecyclerView.Adapter {

}
interface OnClickItem {
    fun onClick()
}
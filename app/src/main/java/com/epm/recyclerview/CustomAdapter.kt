package com.epm.recyclerview

import android.view.LayoutInflater
import androidx.recyclerview.widget.RecyclerView
import android.widget.TextView
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView

class CustomAdapter: RecyclerView.Adapter<CustomAdapter.ViewHolder>(){

    val titles = arrayOf(
        "Ciudad X_1",
        "Ciudad X_2",
        "Ciudad X_3",
        "Ciudad X_4",
        "Ciudad X_5",
        "Ciudad X_6",
        "Ciudad X_7"
    )
    val excerpt = arrayOf(
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout",
        "It is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout"
    )
    val images = intArrayOf(
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background,
        R.drawable.ic_launcher_background
    )

    inner class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var itemImage: ImageView
        var itemTitle: TextView
        var itemDetail: TextView

        init {
            itemImage = itemView.findViewById(R.id.item_image)
            itemTitle = itemView.findViewById(R.id.item_title)
            itemDetail = itemView.findViewById(R.id.item_excerpt)
        }
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
        val v = LayoutInflater.from(viewGroup.context).inflate(R.layout.card_layout, viewGroup, false)
        return ViewHolder(v)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {
        viewHolder.itemTitle.text = titles[position]
        viewHolder.itemDetail.text = excerpt[position]
        viewHolder.itemImage.setImageResource(images[position])
    }

    override fun getItemCount(): Int {
        return titles.size
    }

}
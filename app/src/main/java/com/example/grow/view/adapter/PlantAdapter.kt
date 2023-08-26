package com.example.grow.view.adapter

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView.Adapter
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.grow.R
import com.example.grow.model.Plant

class PlantAdapter(val plants : List<Plant>) : Adapter<PlantAdapter.PlantViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.plant_row , parent , false)
        return PlantViewHolder(view)
    }


    override fun onBindViewHolder(holder: PlantViewHolder, position: Int) {
        holder.txtTitle.text = plants[position].title
        holder.txtDescription.text = plants[position].desc
        var color = "#CCCCCC"
        if (position %2 == 0)
            color = "#EEEEEE"

        holder.container.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return plants.size;
    }

    class PlantViewHolder(itemView: View) : ViewHolder(itemView) {
        var txtTitle = itemView.findViewById<TextView>(R.id.txtTitle)
        var txtDescription = itemView.findViewById<TextView>(R.id.txtDescription)
        var container = itemView.findViewById<LinearLayout>(R.id.container)
    }
}



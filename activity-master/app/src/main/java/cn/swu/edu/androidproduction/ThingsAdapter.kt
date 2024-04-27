package cn.swu.edu.androidproduction

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

/**
 * Created by ghx on 2022/3/17.
 */
class ThingsAdapter(val things: ArrayList<Things>) : RecyclerView.Adapter<ThingsAdapter.ThingsViewHolder>() {

    inner class ThingsViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name = itemView.findViewById<TextView>(R.id.name)
        val desc = itemView.findViewById<TextView>(R.id.description)
        val img =  itemView.findViewById<ImageView>(R.id.avatar)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ThingsViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_things ,parent,false)
        val holder = ThingsViewHolder(view)
        return holder
    }

    override fun onBindViewHolder(holder: ThingsViewHolder, position: Int) {
        val thing = things[position]
        holder.name.text = thing.name
        holder.desc.text = thing.description
        holder.img.setImageResource(thing.avatar)
    }

    override fun getItemCount(): Int {
        return things.size
    }
}
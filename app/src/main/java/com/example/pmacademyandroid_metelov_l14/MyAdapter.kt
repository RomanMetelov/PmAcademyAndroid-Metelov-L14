package com.example.pmacademyandroid_metelov_l14

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(private val items: List<Pair<Person, Int>>, private val density: Float) :
    RecyclerView.Adapter<MyAdapter.PersonViewHolder>() {

    inner class PersonViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        fun bind(name: String, age: Int, generationLevel: Int) {
            val leftPadding: Int = (24 * (generationLevel) * density).toInt()

            itemView.run {
                findViewById<LinearLayout>(R.id.personItemContainer)
                    .setPadding(leftPadding, 8, 8, 8)

                findViewById<TextView>(R.id.tvName).text = name
                findViewById<TextView>(R.id.tvAge).text =
                    itemView.context.getString(R.string.tvAge, age)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PersonViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.person_recycler_item, parent, false)
        return PersonViewHolder(view)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        val pair = items[position]
        holder.bind(pair.first.name, pair.first.age, pair.second)
    }

    override fun getItemCount(): Int = items.size
}
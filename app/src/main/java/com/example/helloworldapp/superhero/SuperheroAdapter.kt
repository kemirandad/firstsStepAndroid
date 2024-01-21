package com.example.helloworldapp.superhero


import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldapp.R

class SuperheroAdapter(private val superheros: MutableList<Superhero>)
    : RecyclerView.Adapter<SuperheroViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperheroViewHolder {
        val view = LayoutInflater.from(parent.context)
        return SuperheroViewHolder(view.inflate(R.layout.item_superhero_list, parent, false))
    }


    override fun onBindViewHolder(holder: SuperheroViewHolder, position: Int) {
        val item = superheros[position]
        holder.render(item)
    }

    override fun getItemCount(): Int = superheros.size
}

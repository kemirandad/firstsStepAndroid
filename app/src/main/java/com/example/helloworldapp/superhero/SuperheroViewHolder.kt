package com.example.helloworldapp.superhero

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldapp.R
import com.squareup.picasso.Picasso

class SuperheroViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val superheroName: TextView = view.findViewById(R.id.tvSuperhero)
    private val realName: TextView = view.findViewById(R.id.tvRealName)
    private val publisher: TextView = view.findViewById(R.id.tvPublisher)
    private val avatar: ImageView = view.findViewById(R.id.ivAvatar)

    fun render(superhero: Superhero) {
        superheroName.text = superhero.superhero
        realName.text = superhero.realName
        publisher.text = superhero.publisher

        itemView.setOnClickListener {
            Toast.makeText(
                avatar.context,
                superhero.superhero,
                Toast.LENGTH_SHORT
            ).show()
        }
        avatar.loadUrl(superhero.photo)
    }

    private fun ImageView.loadUrl(url: String) {
        Picasso.with(context).load(url).into(this)
    }
}
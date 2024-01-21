package com.example.helloworldapp.movie

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.helloworldapp.R

class MovieViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    private val tvMovieName : TextView = view.findViewById(R.id.tvMovieName)
    private val tvMovieGenre: TextView = view.findViewById(R.id.tvMovieGenre)

    fun render(movie: Movie){
        tvMovieName.text = movie.title
        tvMovieGenre.text = movie.genre

        itemView.setOnClickListener {
            Toast.makeText(
                tvMovieGenre.context,
                tvMovieName.text,
                Toast.LENGTH_SHORT
            ).show()
        }
    }
}
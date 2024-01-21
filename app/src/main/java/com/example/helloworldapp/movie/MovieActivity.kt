package com.example.helloworldapp.movie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.helloworldapp.R
import java.util.ArrayList

class MovieActivity : AppCompatActivity() {

    private lateinit var tvTitleMovieApp: TextView
    private lateinit var rvMovies: RecyclerView
    private lateinit var movieAdapter: MovieAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        initComponents()
        initUI()
    }

    private fun initUI() {
        movieAdapter = MovieAdapter(getMovies())
        rvMovies.layoutManager = LinearLayoutManager(this)
        rvMovies.adapter = movieAdapter
    }

    private fun getMovies(): MutableList<Movie> {
        val movies : MutableList<Movie> = ArrayList()
        movies.add(Movie("Forrest Gump", "Comedia"))
        movies.add(Movie("Cars", "Infantil"))
        movies.add(Movie("Iron Man", "Superheroes"))
        movies.add(Movie("Anabelle", "Terror"))
        movies.add(Movie("Forrest Gump", "Comedia"))
        movies.add(Movie("Cars", "Infantil"))
        movies.add(Movie("Iron Man", "Superheroes"))
        movies.add(Movie("Anabelle", "Terror"))
        return movies
    }

    private fun initComponents() {
        tvTitleMovieApp = findViewById(R.id.tvTitleMovieApp)
        rvMovies = findViewById(R.id.rvMovies)
    }
}
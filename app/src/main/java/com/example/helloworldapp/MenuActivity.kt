package com.example.helloworldapp

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.helloworldapp.R.*
import com.example.helloworldapp.calculator.CalculatorActivity
import com.example.helloworldapp.firstapp.FirstAppActivity
import com.example.helloworldapp.imccalculator.ImcCalculatorActivity
import com.example.helloworldapp.movie.MovieActivity
import com.example.helloworldapp.superhero.SuperheroActivity
import com.example.helloworldapp.todoapp.TodoActivity

class MenuActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(layout.activity_menu)

        val btnSaludApp = findViewById<Button>(R.id.btnSaludApp)
        val btnImcApp = findViewById<Button>(R.id.btnImcApp)
        val btnCalculator = findViewById<Button>(R.id.btnCalculator)
        val btnTODO = findViewById<Button>(R.id.btnTODO)
        val btnMovie = findViewById<Button>(R.id.btnMovie)
        val btnSuperhero = findViewById<Button>(R.id.btnSuperhero)

        btnSaludApp.setOnClickListener { navigateToSaludApp() }
        btnImcApp.setOnClickListener { navigateToImcApp() }
        btnCalculator.setOnClickListener { navigateToCalculator() }
        btnTODO.setOnClickListener { navigateToDoApp() }
        btnMovie.setOnClickListener { navigateToMovieapp() }
        btnSuperhero.setOnClickListener { navigateToSuperhero() }
    }

    private fun navigateToSuperhero() {
        val intent = Intent(this, SuperheroActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToMovieapp() {
        val intent = Intent(this, MovieActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToDoApp() {
        val intent = Intent(this, TodoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCalculator() {
        val intent = Intent(this, CalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToImcApp() {
        val intent = Intent(this, ImcCalculatorActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToSaludApp() {
        val intent = Intent(this, FirstAppActivity::class.java)
        startActivity(intent)
    }


}
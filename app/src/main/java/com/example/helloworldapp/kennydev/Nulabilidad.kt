package com.example.helloworldapp.kennydev

fun main() {
    var name:String? = "Kenny"

    println(name?.get(3) ?: "Sin contenido")
}
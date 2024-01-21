package com.example.helloworldapp.kennydev

fun main() {
    val name = "kennydev"

    //println("Hello, World!")
    val weekDays = arrayOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sabado", "Domingo")
    //weekDays.forEach { e -> print("$e, ") }

    weekDays[0] = "Hola"
    //weekDays.forEach { e -> print("$e, ") }

    //Bucles para Arrays
    for (position in weekDays.indices){
        //println(weekDays[position])
    }

    for ((i, v) in weekDays.withIndex()){
        //println("La posición $i, contiene el valor $v")
    }

    for (weekday in weekDays){
        println("Ahora es $weekday")
    }
}
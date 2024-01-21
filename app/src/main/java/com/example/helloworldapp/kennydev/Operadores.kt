package com.example.helloworldapp.kennydev

fun main() {
    val age1 = 31
    val age2 = 30

    val exampleLong : Long = 42

    val exampleFloat : Float = 33.33f

    val stringExample1 = "Mi nombre es "
    val stringExample2 = "Kenny Miranda"

    val stringExample3 = "22"
    val stringExample4 = "44a"

//    println("Sumar: ")
//    println(age1 + age2)
//
//    println("Restar: ")
//    println(age1 - age2)
//
//    println("Multiplicar: ")
//    println(age1 * age2)
//
//    println("División: ")
//    println(age1 / age2)
//
//    println("Modulo: ")
//    println(age1 % age2)

    var exampleSuma: Int = age1 + exampleFloat.toInt()

    val exampleString12: String = age1.toString()

    var stringConcantenada : String = "Hola"
    println(stringConcantenada)
    stringConcantenada = "Hola me llamo $stringExample2 y tengo $age2 años"
    println(stringConcantenada)

}
package com.example.helloworldapp.kennydev

val age: Int = 30
val name: String = "Kenny Miranda"
val num1: Int = 16
val num2: Int = 4

fun main() {
    println("Hello, World!")
    println("Mi nombre es $name y tengo $age años")

    println("Suma: ${sumarDosNumeros(num1, num2)}")
    println("Resta: ${restarDosNumeros(num1, num2)}")
    println("Multiplicar: ${multiplicarDosNumeros(num1, num2)}")
    println("Dividir: ${dividirDosNumeros(num1, num2)}")

    println("Sumar muchas numeros: ${sumarNumeros(1, 2, 3.14, 516)}")
    println("Restar muchas numeros: ${restarNumeros(24,8,4,2)}")
}

fun sumarDosNumeros(
    a: Int,
    b: Int
) : Int {
    return a + b
}


fun restarDosNumeros(
    a: Int,
    b: Int
) : Int {
    return a - b
}


fun multiplicarDosNumeros(
    a: Int,
    b: Int
) : Int {
    return a * b
}


fun dividirDosNumeros(
    a: Int,
    b: Int
) : Int {
    return a / b
}

fun <T : Number> sumarNumeros(vararg numeros: T): T {
    // Uso de la función sumBy() de Kotlin para sumar los números
    return numeros.sumOf { it.toDouble() } as T
}

fun <T : Number> restarNumeros(vararg numeros: T): T {
    // Uso de la función sumBy() de Kotlin para sumar los números
    return numeros.sumOf { it.toDouble() } as T
}
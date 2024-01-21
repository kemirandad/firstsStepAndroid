package com.example.helloworldapp.kennydev

fun main() {
    mutableList()
}

fun inmutableList(){
    val readOnly : List<String> = listOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

//    println(readOnly.size)
//    println(readOnly)
//    println(readOnly.get(1))
//    println(readOnly.last())
//    println(readOnly.first())


    // Filter
    val example = readOnly.filter { it.contains('a') }
    //println(example)

    // Iterar
    readOnly.forEach { weekday -> println(weekday) }
}

fun mutableList() {
    var weekDays: MutableList<String> = mutableListOf("Lunes", "Martes", "Miércoles", "Jueves", "Viernes", "Sábado", "Domingo")

    weekDays.add(3, "Festivo")
    //println(weekDays)

    if (weekDays.isEmpty()) else weekDays.forEach { print("$it ") }
}
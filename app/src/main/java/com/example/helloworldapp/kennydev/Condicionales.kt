package com.example.helloworldapp.kennydev

fun main() {
    //println(ifBasico())
    result("America")
}
// Usando IF
fun ifBasico(): String{
    val name = "Fulano"
    if (name == "Pepe"){
        return "Oye, la variable name es Pepe"
    }
    return "Oye la variable name es $name"
}

fun ifAnidado() {
    val animal = "dog"

    if (animal == "dog"){
        println("Es un perrito")
    }else if (animal == "cat"){
        println("Es un gato")
    }else if (animal == "bird"){
        println("Es un pajaro")
    }else{
        println("No es un un animal")
    }
}

fun ifBoolean(){
    val soyFeliz : Boolean = false

    // sin nada = true
    // con ! al inicio = false

    if (soyFeliz){
        println("Si, soy feliz!")
    }else{
        println("No, no soy feliz :c")
    }
}

fun ifInt(){
    val age = 18

    if (age >= 18){
        println("Beber cerveza")
    }else{
        println("Beber jugo")
    }
}

fun ifMultiple(){
    var age = 18
    var tengoPermiso = true

    if (age >= 18 && !tengoPermiso){
        println("Puedo beber una cerveza")
    }else{
        println("No puedo beber cerveza :c")
    }
}

fun ifMultipleOr(){
    var pet = "dog"
    val isHappy = true

    if (pet == "dog"  || (pet == "cat" && isHappy)){
        println("Es un gato o un perro")
    }
}

// Usando WHEN
fun getMonth(month: Int){
    if (month == 1){
        println("Enero")
    }else if (month == 2){
        println("Febrero")
    }else if (month == 3){
        println("Marzo")
    }else if (month == 4){
        println("Abril")
    }else if (month == 5){
        println("Mayo")
    }else if (month == 6){
        println("Junio")
    }else if (month == 7){
        println("Julio")
    }else if (month == 8){
        println("Agosto")
    }else if (month == 9){
        println("Septiembre")
    }else if (month == 10){
        println("Octubre")
    }else if (month == 11){
        println("Noviembre")
    }else if (month == 12){
        println("Diciembre")
    }else{
        println("No es un mes valido")
    }
}

fun getMonth2(month: Int){
    when (month){
        1 -> println("enero")
        2 -> println("febrero")
        3 -> println("marzo")
        4 -> println("abril")
        5 -> println("mayo")
        6 -> println("junio")
        7 -> println("julio")
        8 -> println("agosto")
        9 -> println("septiembre")
        10 -> println("octubre")
        11 -> {
            println("noviembre")
            println("Noviembre")
        }
        12 -> println("diciembre")
        else -> println("No es un mes valido")
    }
}

fun getTrimester(month: Int){
    when (month){
        1, 2, 3 -> println("Primer trimestre")
        4, 5, 6-> println("Segundo trimestre")
        7, 8 , 9 -> println("Tercer trimestre")
        10, 11, 12 -> println("Cuarto trimestre")
        else -> println("No es un mes valido")
    }
}

fun getSemester(month: Int){
    when (month){
        in 1..6 -> println("Primer semestre")
        in 7..12 -> println("Segundo semestre")
        !in 1..12 -> println("Semestre no valido")
    }
}

fun result(value: Any){
    when (value) {
        is Int ->  println(value + value)
        is String -> println(value)
        is Boolean -> if (value) println("holiwi") else println("Bye")
    }
}

fun getSemester2(month: Int) = when (month) {
        in 1..6 -> "Primer semestre"
        in 7..12 -> "Segundo semestre"
        else -> "No es un mes valido"
    }
package com.example.helloworldapp.todoapp

data class Task (val name: String, val category:TaskCategory, var isSelected: Boolean = false){

}
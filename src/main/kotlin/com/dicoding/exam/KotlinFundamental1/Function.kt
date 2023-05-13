package com.dicoding.exam.KotlinFundamental1

fun main() {
    val user = setUser("Avriansyah", 23)
    println(user)

    printUser("Avriansyah")
}

fun setUser(name: String, age: Int) = "Your name is $name, and you $age years old"

fun printUser(name: String) {
    println("Your name is $name")
}

/*
output :
Your name is Avriansyah, and you 19 years old
Your name is Avriansyah
*/
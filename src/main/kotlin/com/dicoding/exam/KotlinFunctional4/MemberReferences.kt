package com.dicoding.exam.KotlinFunctional4

var message2 = "Kotlin"
fun main() {
    val numbers = 1.rangeTo(10)
    val evenNumbers = numbers.filter(::isEvenNumber)
    val evenNumbers2 = numbers.filter(Int::isEvenNumber2)


    println(evenNumbers)
    println(evenNumbers2)

    println(::message2.name)
    println(::message2.get())

    ::message2.set("Kotlin Academy")

    println(::message2.get())
}

fun isEvenNumber(number: Int) = number % 2 == 0

// Selain itu, kita juga bisa mereferensikan sebuah extensions function.
fun Int.isEvenNumber2() = this % 2 == 0

/*
   output = [2, 4, 6, 8, 10]
*/
// Author Avriansyah Bahtiar
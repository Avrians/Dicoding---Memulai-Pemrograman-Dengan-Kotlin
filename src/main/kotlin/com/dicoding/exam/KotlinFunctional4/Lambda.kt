package com.dicoding.exam.KotlinFunctional4

fun main() {
    message()
    /*
   output : Hello From Lambda
    */

    printMessage("Hello From Lambda")
    /*
   output : Hello From Lambda
    */

    val length = messageLength("Hello From lambda")
    println("Message length $length")
    /*
   output : Message length 17
    */

}

val message = { println("Hello From Lambda") }

val printMessage = { message: String -> println(message) }

val messageLength = { message: String -> message.length }


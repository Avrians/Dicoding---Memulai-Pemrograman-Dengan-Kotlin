package com.dicoding.exam.KotlinFunctional4

fun main() {
    val text = "Hello"
    val result = text.run {
        val from = this
        val to = this.replace("Hello", "Kotlin")
        "replace text from $from to $to"
    }
    println("result : $result")
    /*
   output : result : replace text from Hello to Kotlin
    */

    val message = "Hello Kotlin!"
    val result2 = with(message) {
        println("value is $this")
        println("with length ${this.length}")
    }

    println(result2)
    /*
    value is Hello Kotlin!
    with length 13
    kotlin.Unit
     */

    val result3 = with(message) {
        "First character is ${this[0]}" +
                " and last character is ${this[this.length - 1]}"
    }

    println(result3)
    /*
   output : First character is H and last character is !
    */

    val builder = StringBuilder()
    builder.append("Hello ")
    builder.append("Kotlin!")

    println(builder.toString())
    /*
   output : Hello Kotlin
    */

    val message2 = StringBuilder().apply {
        append("Hello ")
        append("Kotlin!")
    }

    println(message2.toString())
    /*
   output : Hello Kotlin
    */
}

// Author Avriansyah Bahtiar
package com.dicoding.exam.KotlinFunctional4

fun main() {
    val buildString = StringBuilder().apply {
        append("Hello ")
        append("Kotlin ")
    }

    val text = "Hello"
    text.let {
        val message = "$it Kotlin"
        println(message)
    }

    text.let { value ->
        val message = "$value Kotlin"
        println(message)
    }
}
// Author Avriansyah Bahtiar
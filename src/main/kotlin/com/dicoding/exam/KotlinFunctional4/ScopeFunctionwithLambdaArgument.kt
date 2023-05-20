package com.dicoding.exam.KotlinFunctional4

fun main() {
    val message: String? = null
    message?.let {
        val length = it.length * 2
        val text = "text length $length"
        println(text)
    } ?: run {
        val text = "message is null"
        println(text)
    }

    // Dengan menggunakan fungsi let seperti pada kode di atas, kita bisa mengurangi penggunaan operator safe call seperti berikut:
    val length = message?.length ?: 0 * 2
    val text = "text length $length"
    println(text)

    val text2 = "Hello Kotlin"
    val result = text2.also {
        println("value length -> ${it.length}")
    }

    println("text -> $result")
    /*
    output :
           value length -> 12
           text -> Hello Kotlin
    */


}
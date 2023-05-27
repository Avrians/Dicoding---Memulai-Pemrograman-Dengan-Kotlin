package com.dicoding.exam.KotlinCorountines7

import kotlinx.coroutines.*

fun main() = runBlocking{
    launch {
        delay(1000L)
        println("Coroutines!")
    }
    println("Hello,")
    delay(2000L)
}


// Author Avriansyah Bahtiar
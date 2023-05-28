package com.dicoding.exam.KotlinCorountines7

import kotlinx.coroutines.*

fun main() = runBlocking {
    val capital = async { getCapital() }
    val income = async { getIncome() }
    println("Your profit is ${income.await() - capital.await()}")
}


// Author Avriansyah Bahtiar
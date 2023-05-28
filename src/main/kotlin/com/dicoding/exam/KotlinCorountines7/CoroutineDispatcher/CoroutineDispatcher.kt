package com.dicoding.exam.KotlinCorountines7.CoroutineDispatcher
import kotlinx.coroutines.*


// Dispatchers.Default
//launch {
//    // TODO: Implement suspending lambda here
//}

// atau
//launch(Dispatchers.Default){
//    // TODO: Implement suspending lambda here
//}


// Dispatchers.Unconfined
fun main() = runBlocking<Unit> {
    launch(Dispatchers.Unconfined) {
        println("Starting in ${Thread.currentThread().name}")
        delay(1000)
        println("Resuming in ${Thread.currentThread().name}")
    }.start()
}


// Author Avriansyah Bahtiar
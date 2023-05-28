package com.dicoding.exam.KotlinCorountines7
import kotlinx.coroutines.*


/*
//menggunakan launch():
fun main() = runBlocking {
    val job = launch {
        // Do background task here
    }
}

//menggunakan Job():
fun main() = runBlocking {
    val job = Job()
}
 */


fun main() = runBlocking {
    val job = launch(start = CoroutineStart.LAZY) {
        delay(1000L)
        println("Start new job!")
    }

    job.start()
    println("Other task")

    // atau bisa menggunakan join
    job.join()
    println("Other task")
}


// Author Avriansyah Bahtiar
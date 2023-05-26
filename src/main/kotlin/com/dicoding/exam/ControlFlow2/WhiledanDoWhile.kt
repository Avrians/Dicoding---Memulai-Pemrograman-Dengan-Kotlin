package com.dicoding.exam.ControlFlow2

fun main() {
    var counter = 1
    while (counter <= 7){
        println("Hello, World!")
        counter++
    }
    /*
   output :
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
    */

    do {
        println("Hello, World!")
        counter++
    } while (counter <= 7)
    /*
   output:
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
       Hello, World!
    */

}

// Author Avriansyah Bahtiar
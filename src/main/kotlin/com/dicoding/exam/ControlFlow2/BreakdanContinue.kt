package com.dicoding.exam.ControlFlow2

fun main() {
    val listOfInt = listOf(1, 2, 3, null, 5, null, 7)

    for (i in listOfInt) {
        if (i == null) continue
        print(i)
    }
    println("")
    /*
   output: 12357
    */

    for (i in listOfInt) {
        if (i == null) break
        print(i)
    }
    /*
    output: 123
    */

    println("")
    // Break dan Continue Labels
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
    /*
   output :
       Outside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
       Inside Loop
    */
}
// Author Avriansyah Bahtiar
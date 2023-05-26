package com.dicoding.exam.KotlinFunctional4

fun main() {
    10.printInt()
    /*
   output : value 10
    */

    println(10.plusThree())
    /*
   output : 13
    */

    println(10.slice)
    /*
   output : 5
    */

}

fun Int.printInt() {
    println("value $this")
}

fun Int.plusThree(): Int {
    return this + 3
}

val Int.slice: Int
    get() = this / 2

// Author Avriansyah Bahtiar



package com.dicoding.exam.KotlinOOP5

fun main() {
    val someString = "Dicoding"
    println(someString.reversed())
    println(someString.toUpperCase())
    println(someString.toLowerCase())
    /*
    Output:
    gnidociD
    DICODING
    dicoding
    */

    val someString2 = "123"
    val someInt = someString2.toInt()
    val someOtherString = "12.34"
    val someDouble = someOtherString.toDouble()

    println(someInt is Int)
    println(someDouble is Double)
    /*
    Output:

    true
    true
    */

}

// Author Avriansyah Bahtiar


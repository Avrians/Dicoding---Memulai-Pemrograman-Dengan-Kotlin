package com.dicoding.exam.KotlinFundamental1

fun main() {
    val array = arrayOf(1, 3, 5, 7)
    val mixArray = arrayOf(1, 3, 5, 7 , "Dicoding" , true)

    /*
    Kotlin juga memungkinkan kita untuk membuat Array dengan tipe data primitif dengan memanfaatkan beberapa fungsi spesifik berikut:
    intArrayOf() : IntArray
    booleanArrayOf() : BooleanArray
    charArrayOf() : CharArray
    longArrayOf() : LongArray
    shortArrayOf() : ShortArray
    byteArrayOf() : ByteArray
     */

    val intArray = intArrayOf(1, 3, 5, 7)  // [1, 3, 5, 7]
    println(intArray[2])
    intArray[2] = 11                       // [1, 3, 11, 7]

    println(intArray[2])
}

/*
   Output: 5
   Output: 11
*/

// Author Avriansyah Bahtiar
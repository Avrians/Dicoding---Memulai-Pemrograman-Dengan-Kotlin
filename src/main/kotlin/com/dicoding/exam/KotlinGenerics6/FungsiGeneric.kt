package com.dicoding.exam.KotlinGenerics6

fun main() {
    val numbers = (1..100).toList()
    println(numbers.slice<Int>(1..10))
    // atau kita bisa menyederhanakannya
    println(numbers.slice(1..10))
}

/*
   output : [2, 3, 4, 5, 6, 7, 8, 9, 10, 11]
*/


// Author Avriansyah Bahtiar
package com.dicoding.exam.KotlinFundamental1

fun main() {
    //  tipe data Char kita bisa menggunakan tanda kutip tunggal (' ')
    // val character = 'A'
    // val character2: Char = 'ABC' Incorrect character literal

    var vocal = 'A'

    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal++)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
    println("Vocal " + vocal--)
}

/*
   output:
       Vocal A
       Vocal B
       Vocal C
       Vocal D
       Vocal C
       Vocal B
       Vocal A
*/
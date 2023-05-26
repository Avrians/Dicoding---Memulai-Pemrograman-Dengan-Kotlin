package com.dicoding.exam.ControlFlow2

import kotlin.random.Random


fun main() {
    val value = 20

    when(value){
        6 -> println("value is 6")
        7 -> println("value is 7")
        8 -> println("value is 8")
        else -> println("value cannot be reached")
    }

    /*
   output: value cannot be reached
    */
    val value2 = 7
    val stringOfValue = when (value2) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }
    // else adalah hal wajib jika kita menggunakan when expression untuk mengembalikan nilai. Bagaimana jika kita melewatkannya? Akan tampil eror berikut:
    //'when' expression must be exhaustive, add necessary 'else' branch

    println(stringOfValue)
    /*
   output : value is 7
    */

    val stringOfValue2 = when (value2) {
        6 -> {
            println("Six")
            "value is 6"
        }
        7 -> {
            println("Seven")
            "value is 7"
        }
        8 -> {
            println("Eight")
            "value is 8"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue2)
    /*
   output :
            Seven
            value is 7

    */

    // when juga memungkinkan kita untuk memeriksa instance dengan tipe tertentu dari sebuah objek menggunakan is atau !is. Contohnya seperti berikut:
    val anyType : Any = 100L
    when(anyType){
        is Long -> println("the value has a Long type")
        is String -> println("the value has a String type")
        else -> println("undefined")
    }

    /*
   output : the value has a Long type
    */

    // Selain itu, when expression juga bisa kita gunakan untuk memeriksa nilai yang terdapat pada sebuah Range atau Collection.

    val value3 =  27
    val ranges = 10..50

    when(value3){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
    /*
   output : value is in the range
    */

    val registerNumber = when(val regis = getRegisterNumber()){
        in 1..50 -> 50 * regis
        in 51..100 -> 100 * regis
        else -> regis
    }

    // if expression sebaiknya digunakan ketika kondisi yang diberikan tidak lebih dari 2 (dua) dan kondisi yang diberikan tidak terlalu rumit.
    if (anyType is Long){
        println("the value has a Long type")
    } else {
        println("the value is not Long type")
    }

    // Berbeda dengan when expression, ia bisa digunakan ketika kondisi yang diberikan lebih dari 2 (dua).
    when (anyType) {
        is Long -> println("the value has a Long type")
        is Int -> println("the value has a Int type")
        is Double -> println("the value has a Double type")
        else -> println("undefined")
    }
}

fun getRegisterNumber() = Random.nextInt(100)
// Author Avriansyah Bahtiar
package com.dicoding.exam.KotlinFundamental1

fun main() {
    val name = "Kotlin"
    println("My name is " + name)
    /*
   output : My name is Kotlin
    */

    // Untuk menggunakan string template, kita hanya perlu menambahkan karakter $ sebelum nama variabel yang akan disisipkan seperti berikut:
    println("My name is $name")
    /*
   output : My name is Kotlin
    */


    val old = 3
    println("My name is $name, im $old years old")
    /*
   output : My name is Kotlin, im 3 years old
    */


    val hour = 7
    print("Office ${if (hour > 7) "already close" else "is open"}")
    /*
   output : Office is open
    */
}

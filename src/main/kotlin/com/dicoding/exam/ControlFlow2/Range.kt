package com.dicoding.exam.ControlFlow2

fun main() {
    val rangeInt = 1..10
    // val rangeInt = 1.rangeTo(10) Hasilnya akan sama seperti yang diatas cuma beda format penulisan
    println(rangeInt.step)
    /*
   output: 1
    */

    println("")
    val rangeInt2 = 1..10 step 2
    rangeInt2.forEach {
        print("$it ")
    }
    println("")
    println(rangeInt2.step)
    /*
   output: 1 3 5 7 9
           2
    */

    // Kita juga bisa memeriksa apakah suatu nilai ada pada cakupan nilai Range.
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
    // format diatas sama dengan
    if (1 <= 7 && 7 <= 10){
        println("Value 7 available")
    }
    // hasilnya akan sama
    /*
   output: Value 7 available
   output: Value 7 available
    */

    // Sebaliknya, kita juga bisa memeriksa apakah suatu nilai tidak ada pada nilai cakupan Range tersebut.
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
    /*
   output: No value 11 in Range
    */

    // Range pada Kotlin mendukung beberapa tipe integral seperti IntRange, LongRange dan CharRange. Sehingga selain nilai numerik, kita juga bisa menentukan tipe Character sebagai nilai yang dicakup oleh Range:
    val rangeChar = 'A'.rangeTo('F')
    // Nilai pada variable rangeChar di atas mencakup A, B, C, D, E, F

}
// Author Avriansyah Bahtiar
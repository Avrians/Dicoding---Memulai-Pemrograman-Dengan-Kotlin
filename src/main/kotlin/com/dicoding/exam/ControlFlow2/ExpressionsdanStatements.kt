package com.dicoding.exam.ControlFlow2

fun main() {
    val openOffice = 7
    val now = 8
    if (now > openOffice)
        println("Office already open")
    else
        println("Office close")
    // Pada contoh kode di atas, if dikatakan sebagai statement karena ia tidak mengembalikan nilai apapun, hanya sebagai percabangan pada bahasa Kotlin.

    // Yang dimaksud dengan expression adalah statement yang dapat mengembalikan nilai dan bisa kita simpan ke dalam sebuah variabel seperti contoh berikut:
    val office = if (now > openOffice) "Office already open" else "Office close"
    println(office)

    // di dalam sebuah expression juga bisa terdapat sebuah expression lagi.
    sum(1 , 1 * 4)
    // Pada kode diatas 1 * 4 merupakan sebuah expression yang ada pada pemanggilan fungsi sum() alias fungsi yang mengembalikan nilai. Setiap fungsi selalu mengembalikan nilai. Alhasil, pemanggilan sebuah fungsi merupakan sebuah expression.

    val value1 = 10
    val value2 = 10

    sum(value1, value2)

    // Pada kode di atas deklarasi variabel value1 dan value2 merupakan sebuah statement. Sedangkan pemanggilan fungsi sum seperti yang dijelaskan di atas, merupakan sebuah expression.
}

fun sum(value1: Int, value2: Int) = value1 + value2

// Author Avriansyah Bahtiar
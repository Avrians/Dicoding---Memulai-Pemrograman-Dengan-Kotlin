package com.dicoding.exam.DataClasses3

fun main() {
    val list = (1..1000000).toList()
    // list.filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) } //eager evaluation atau dikenal dengan horizontal evaluation, list akan menyelesaikan proses filter terhadap 1 juta data baru kemudian melakukan mapping data sampai akhirnya ditampilkan pada konsol.

    list.asSequence().filter { it % 5 == 0 }.map { it * 2 }.forEach { println(it) }

    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") } //  fungsi take() supaya program tidak mengalami infinite loop.
    // Output: 1 2 3 4 5
}
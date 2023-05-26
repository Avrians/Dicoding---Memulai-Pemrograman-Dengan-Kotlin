package com.dicoding.exam.DataClasses3

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val evenList = numberList.filter { it % 2 == 0 }
    // evenList: [2, 4, 6, 8, 10]

    val notEvenList = numberList.filterNot { it % 2 == 0 }
    // notEvenList: [1, 3, 5, 7, 9]

    // Jadi, bisa disimpulkan bahwa filterNot() merupakan kebalikan dari filter().

    val multipliedBy5 = numberList.map { it % 2 == 0 }
    println(multipliedBy5)
    // multipliedBy5: [5, 10, 15, 20, 25, 30, 35, 40, 45, 50]

    println(numberList.count())
    // Output: 10

    println(numberList.count { it % 3 == 0 })
    // Output: 3

    val firstOddNumber = numberList.find { it % 2 == 1 }
    val firstOrNullNumber = numberList.firstOrNull { it % 2 == 3 }
    // firstOddNumber: 1
    // firstOrNullNumber: null

    val moreThan10 = numberList.first { it > 10 }
    println(moreThan10)
    // Output: Exception in thread "main" java.util.NoSuchElementException: Collection contains no element matching the predicate.

    //Fungsi sum() khusus hanya bisa digunakan untuk collection yang bertipe angka. Fungsi ini akan menjumlahkan setiap data yang ada pada collection.
    val total = numberList.sum()
    // total: 55

    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    println(ascendingSort)
    // ascendingSort: [i, k, l, n, o, t]

    val descendingSort = kotlinChar.sortedDescending()
    println(descendingSort)
    // descendingSort: [t, o, n, l, k, i]
}
// Author Avriansyah Bahtiar

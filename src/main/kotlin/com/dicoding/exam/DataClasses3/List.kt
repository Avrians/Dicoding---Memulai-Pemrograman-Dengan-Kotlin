package com.dicoding.exam.DataClasses3

fun main() {
    val numberList : List<Int> = listOf(1, 2, 3, 4, 5)

    val numberList2 = listOf(1, 2, 3, 4, 5) // sama seperti diatas, cuma sedikit lebih ringkas
    val charList = listOf('a', 'b', 'c')

    var anyList3 = listOf('a', "Kotlin", 3, true)

    val anyList2 = listOf('a', "Kotlin", 3, true, User("joko",12))
    println(anyList3[3])
    println(anyList3[5])

    val anyList = mutableListOf('a', "Kotlin", 3, true, User("joko",12))

    anyList.add('d') // menambah item di akhir list
    anyList.add(1, "love") // menambah item pada indeks ke-1
    anyList[3] = false // mengubah nilai item pada indeks ke-3
    anyList.removeAt(0) // menghapus item pada indeks ke-0
}
// Author Avriansyah Bahtiar
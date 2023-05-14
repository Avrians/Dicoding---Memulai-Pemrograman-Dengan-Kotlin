package com.dicoding.exam.DataClasses3

fun main() {
    val integerSet = setOf(1,2,4,2,1,5)
    println(integerSet)
    // Output: [1, 2, 4, 5]

    val setA = setOf(1, 2, 4, 2, 1, 5)
    val setB = setOf(1, 2, 4, 5)
    println(setA == setB)
    // Output: true

    print(5 in setA)
    // Output: true

    val setC = setOf(1, 5, 7)
    val union = setA.union(setC) // gabungan
    val intersect = setA.intersect(setC) // irisan

    println(union)
    println(intersect)
    // union: [1, 2, 4, 5, 7]
    // intersect: [1, 5]

    val mutableSet = mutableSetOf(1, 2, 4, 2, 1, 5)
    //mutableSet[2] = 6 // tidak bisa mengubah set immutable
    mutableSet.add(6) // menambah item di akhir set
    mutableSet.remove(1) //menghapus item yang memiliki nilai 1

}
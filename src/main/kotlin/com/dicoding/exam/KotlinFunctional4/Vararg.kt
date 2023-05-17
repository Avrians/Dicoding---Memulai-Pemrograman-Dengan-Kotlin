package com.dicoding.exam.KotlinFunctional4

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    println(number)
    /*
   output : 100
    */

    val number2 = getNumberSize(10, 20, 30, 40, 50)
    println(number2)
    /*
   output : 5
    */

    sets("Kotlin", 10, 10)
    // atau
    sets2(10, 10, name = "Kotlin")
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}

// kita juga bisa menerapkan Generic untuk tipe parameter ketika parameter tersebut ditentukan dengan vararg. Contohnya seperti berikut:
fun <T> asList(vararg input: T): List<T> {
    val result = ArrayList<T>()
    for (item in input)
        result.add(item)
    return result
}

fun getNumberSize(vararg number: Int): Int {
    return number.size
}

fun sets(name: String, vararg number: Int): Int {
    return number.size
}

fun sets2(vararg number: Int, name: String): Int {
    return number.size
}
package com.dicoding.exam.KotlinFunctional4

typealias Arithmetic = (Int, Int) -> Int
fun main() {

    val sum: Arithmetic = { valueA, valueB -> valueA + valueB }

    // Kita juga bisa menandai function type sebagai nullable dengan menempatkannya di dalam tanda kurung dan diakhiri dengan safe call
    // typealias Arithmetic = ((Int, Int) -> Int)?
    // sum?.invoke(10, 20) // contoh penggunaan function type yang ditandai sebagai nullable:

    val multiply: Arithmetic = { valueA, valueB -> valueA * valueB }

    val sumResult = sum.invoke(10, 10)
    val multiplyResult = multiply.invoke(20, 20)

    //Atau kita bisa menuliskannya secara langsung dengan menghilangkan operator invoke():
    val sumResult2 = sum(10, 10)
    val multiplyResult2 = multiply(20, 20)
    println(sumResult)
    println(multiplyResult)
}
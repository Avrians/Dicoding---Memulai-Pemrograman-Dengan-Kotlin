package com.dicoding.exam.KotlinFundamental1

fun main() {
    /*
        Contoh 1
     */
    println("===Contoh 1===")
    val maxInt = Int.MAX_VALUE
    val minInt = Int.MIN_VALUE
    val overRangeInt = Int.MAX_VALUE + 1 // This operation has led to an overflow

    println(maxInt)
    println(minInt)
    println("Max Int: $maxInt")
    println("Over range Int: $overRangeInt")

    /*
     output :
            2147483647
            -2147483648
            Max Int: 2147483647
            Over range Int: -2147483648
     */

    /*
        Contoh 2
     */
    println("\n===Contoh 2===")

    val numberOne = 1
    val numberTwo = 2

    println(numberOne + numberTwo)

    val numberOne2: Int = 27
    val numberTwo2: Int = 10

    println(numberOne2 / numberTwo2)

    println(5 + 4 * 4)

    println((5 + 4) * 4)

    /*
        output : 3
        output : 2
        output: 21
        output: 36
     */
    /*
    Contoh 3
    Di Kotlin kita tidak bisa melakukan konversi secara langsung. Contoh, ketika ingin melakukan konversi dari tipe data Byte ke tipe data Int.
     */
    println("\n===Contoh 3===")

//    val byteNumber: Byte = 1
//    val intNumber: Int = byteNumber // compile error
    val byteNumber: Byte = 10
    val intNumber: Int = byteNumber.toInt() // ready to go
    /*
    Kode di atas menggunakan fungsi toInt() untuk melakukan konversi secara eksplisit dari tipe data Byte ke tipe data Int. Adapun beberapa fungsi konversi yang dapat kita gunakan antara lain:
    toByte(): Byte
    toShort(): Short
    toInt(): Int
    toLong(): Long
    toFloat(): Float
    toDouble(): Double
    toChar(): Char
     */
    val stringNumber = "23"
    val intNumber2 = 3

    println(intNumber2 + stringNumber.toInt())
    /*
     output: 26
     */

    val readableNumber = 1_000_000
    println(readableNumber)

    /*
     output : 1000000
     */
}
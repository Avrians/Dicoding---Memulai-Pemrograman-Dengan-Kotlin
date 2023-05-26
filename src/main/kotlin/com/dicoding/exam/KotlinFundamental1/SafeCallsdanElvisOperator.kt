package com.dicoding.exam.KotlinFundamental1

fun main() {
    val text: String? = null

    /*
    Contoh 1
    Safe calls operator (?.)
     */
    println("===Contoh 1===")
    text?.length

    /*
    Contoh 2
    Elvis Operator (?:)
    */
    println("===Contoh 2===")
    val textLength = text?.length ?: 7
    // Kode di atas sebenarnya sama seperti ketika kita menggunakan if/else berikut:
    // val textLength = if (text != null) text.length else 7

    // penggunaan operator non-null assertion (!!)
    val textLength2 = text!!.length // ready to go ???
    // Dengan menggunakan non-null assertion kompiler akan mengizinkan kita untuk mengakses atau mengelola nilai dari sebuah objek nullable. Namun penggunaan operator tersebut sangat tidak disarankan karena akan memaksa sebuah objek menjadi non-null. Sehingga ketika objek tersebut bernilai null, Anda tetap akan berjumpa dengan NullPointerException.
}

// Author Avriansyah Bahtiar
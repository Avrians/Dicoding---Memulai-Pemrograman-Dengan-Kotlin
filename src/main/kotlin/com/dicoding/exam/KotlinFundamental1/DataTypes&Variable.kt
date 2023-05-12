package com.dicoding.exam.KotlinFundamental1

/*
    Rangkuman Materi
    sebuah variabel membutuhkan ata kunci var atau val, identifier, type dan initialization.
    var identifier: Type = initialization

    contoh variabel dengan tipe String:
    var company: String = "Dicoding"

    Val atau val
    var kita bisa mengubah nilai yang sudah kita inisialisasikan.
    sedangkan val, kita tidak bisa mengubah nilai yang sebelumnya sudah kita inisialisasi.

    Identifier
    Identifier merupakan nama dari sebuah variabel.

    Type
    Tipe data dibutuhkan agar kompiler dapat mengetahui bagaimana sebuah data akan digunakan
 */


fun main() {
    val firstWord = "Dicoding "
    val lastWord = "Academy"
    println(firstWord + lastWord)

    println("\n===CONTOH KE 2===\n")

    val valueA: Int = 10
    val valueB = 20
    print(valueA + valueB)
}

/*
   output:
   Dicoding Academy

   ===CONTOH KE 2===

   30
*/
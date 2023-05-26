package com.dicoding.exam.KotlinFundamental1

fun main() {
    // Penulisan nullable yang salah
    // val text: String = null // compile time error
    
    val text: String? = null // ready to go

    // Namun kita tidak bisa langsung mengakses atau mengelola nilai dari objek yang sudah kita tandai sebagai nullable. Sebagai contoh:
    // val textLength = text.length // compile time error
    // solusinya

    if (text != null){
        val textLength = text.length // ready to go
    }
}

// Author Avriansyah Bahtiar
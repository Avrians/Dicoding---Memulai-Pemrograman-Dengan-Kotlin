package com.dicoding.exam.DataClasses3

fun main() {
    val capital = mapOf(
        "Jakarta" to "Indonesia",
        "London" to "England",
        "New Delhi" to "India"
    )
    println(capital["Jakarta"])
    // Output: Indonesia

    println(capital.getValue("Jakarta"))
    // Output: Indonesia

    // Hasilnya sama saja. Namun sebenarnya terdapat sebuah perbedaan antara keduanya. Saat menggunakan simbol [ ] atau yang kita kenal dengan indexing, konsol akan menampilkan hasil null saat key yang dicari tidak ada di dalam Map. Sedangkan saat kita menggunakan getValue(), konsol akan memberikan sebuah Exception.

    println(capital["Amsterdam"])
    // Output: null

    // println(capital.getValue("Amsterdam")) // jika ini dijalankan hasilnya akan seperti dibawah
    // Output: Exception in thread "main" java.util.NoSuchElementException: Key Amsterdam is missing in the map.

    val mapKeys = capital.keys
    println(mapKeys)
    // mapKeys: [Jakarta, London, New Delhi]

    val mapValues = capital.values
    println(mapValues)
    // mapValues: [Indonesia, England, India]

    val mutableCapital = capital.toMutableMap()
    mutableCapital.put("Amsterdam", "Netherlands")
    mutableCapital.put("Berlin", "Germany")
    // Note : Namun perlu diperhatikan bahwa menggunakan mutable collection itu tidak disarankan.
}
// Author Avriansyah Bahtiar
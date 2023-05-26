package com.dicoding.exam.KotlinFundamental1

fun main() {
    // Kita bisa mendefinisikan variabel String tersebut dengan tanda petik ganda (" ")
    // val textString  = "Kotlin"
    val text  = "Kotlin"
    val firstChar = text[0]

    println("First character of $text is $firstChar")

    /*
    contoh ke 2
     */

    println("\n===Contoh ke 2===\n")

    val text2  = "Kotlin"
    for (char in text2){
        print("$char ")
    }

    println("\n===Contoh ke 3===\n")
    /*
    Contoh ke 3

    jika ada penulisan petik didalam petik akan terjadi eror
    val statement = "Kotlin is "Awesome!""
    untuk mengatasinya dengan cara seperti ini
    val statement = "Kotlin is \"Awesome!\""

    Selain \” di atas, terdapat beberapa karakter lain yang dapat digunakan untuk melakukan escaped di dalam sebuah String, antara lain:
    \t: menambah tab ke dalam teks.
    \n: membuat baris baru di dalam teks.
    \’: menambah karakter single quote kedalam teks.
    \”: menambah karakter double quote kedalam teks.
    \\: menambah karakter backslash kedalam teks.
     */

    // Selain itu, kita juga bisa menambahkan sebuah Unicode ke dalam sebuah String seperti berikut:
    val name = "Unicode test: \u00A9"
    print(name)
    /*
   output: Unicode test : ©
    */

    /*
    contoh ke 4
    Raw String yang memungkinkan kita menuliskan multiline dan arbitrary text.
    */

    println("\n===Contoh ke 4===\n")

    val line = """
        Line 1
        Line 2
        Line 3
        Line 4
    """.trimIndent()

    print(line)
    /*
    output:
        Line 1
        Line 2
        Line 3
        Line 4
 */

}

/*
  output :
  First character of Kotlin is K

  ===Contoh ke 2===

  K o t l i n

  ===Contoh ke 3===

  Unicode test : ©

  ===Contoh ke 4===

        Line 1
        Line 2
        Line 3
        Line 4
*/

// Author Avriansyah Bahtiar
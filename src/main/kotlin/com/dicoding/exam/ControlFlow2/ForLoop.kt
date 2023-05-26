package com.dicoding.exam.ControlFlow2

fun main() {
    val ranges = 1..5 // bisa juga dengan format berikut -> val ranges = 1.rangeTo(5)
    for (i in ranges){
        println("value is $i!")
    }
    /*
   output :
       value is 1!
       value is 2!
       value is 3!
       value is 4!
       value is 5!
    */

    val ranges2 = 1.rangeTo(10) step 3
    for (i in ranges2 ){
        println("value is $i!")
    }
    /*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
    */

    // Kita juga dapat mengakses indeks untuk setiap elemen yang ada pada Ranges dengan memanfaatkan fungsi withIndex() seperti berikut:
    for ((index, value) in ranges2.withIndex()) {
        println("value $value with index $index")
    }
    /*
   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
    */

    // Untuk tujuan yang sama, kita juga bisa loh, memanfaatkan salah satu ekstensi pada Kotlin yaitu forEach. Contohnya seperti berikut:
    ranges2.forEach { value ->
        println("value is $value!")
    }
    /*
   output :
       value is 1!
       value is 4!
       value is 7!
       value is 10!
    */

    // Jika kita mendapatkan indeks dari tiap nilai yang dicakup kita bisa menggunakan ekstensi forEachIndexed seperti berikut:
    ranges2.forEachIndexed { index, value ->
        println("value $value with index $index")
    }
    /*
   output :
       value 1 with index 0
       value 4 with index 1
       value 7 with index 2
       value 10 with index 3
    */

    // Jika kita hanya ingin menggunakan argumen index, maka kita bisa mengubah argumen value menjadi _
    ranges2.forEachIndexed { index, _ ->
        println("index $index")
    }
}
// Author Avriansyah Bahtiar

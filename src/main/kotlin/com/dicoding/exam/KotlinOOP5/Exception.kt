package com.dicoding.exam.KotlinOOP5

fun main() {
    /*
    ArithmeticException merupakan exception yang terjadi karena kita membagi suatu bilangan dengan nilai nol. Berikut merupakan contoh kode yang dapat membangkitkan ArithmeticException.
    val someValue = 6
    println(someValue / 0)
    output:
    Exception in thread "main" java.lang.ArithmeticException: / by zero
     */

    /*
    NumberFormatException disebabkan karena terjadi kesalahan dalam format angka.
    Sebagai contoh, kita akan mengubah sebuah nilai String menjadi Integer tetapi nilai String yang akan kita ubah tidak memiliki format angka yang benar, sehingga dapat membangkitkan NumberFormatException.
    Berikut contoh kodenya:
        val someStringValue = "18.0"
    println(someStringValue.toInt())
    output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
     */

    /*
    Dan yang terakhir adalah NullPointerException atau NPE.
    Walaupun Kotlin memiliki operator Null Safety, NPE tetap bisa saja terjadi. NPE terjadi karena sebuah variabel atau objek memiliki nilai null, padahal seharusnya objek atau variabel tersebut tidak boleh null.
    Berikut contoh kasus yang dapat menyebabkan NullPointerException:
    val someNullValue: String? = null
    val someMustNotNullValue: String = someNullValue!!
    println(someMustNotNullValue)

    output:
    Exception in thread "main" kotlin.NullPointerException at MainKt.main(Main.kt:3)
     */

}



// Author Avriansyah Bahtiar
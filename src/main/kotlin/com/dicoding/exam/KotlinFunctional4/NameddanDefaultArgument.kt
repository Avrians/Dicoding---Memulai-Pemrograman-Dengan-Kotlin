package com.dicoding.exam.KotlinFunctional4

fun main() {
    val fullName = getFullName(first = "Kotlin" , middle = " is ", last = "Awesome")
    println(fullName)
    // atau bisa juga seperti ini, urutan parameter tidak harus urut
    val fullName2 = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    println(fullName2)

    val fullName3 = getFullNameDefault()
    println(fullName3)
    /*
   output : Kotlin is Awesome
    */

    val fullName4 = getFullNameDefault(first = "Dicoding")
    println(fullName4)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}

// Default Argument
fun getFullNameDefault(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}
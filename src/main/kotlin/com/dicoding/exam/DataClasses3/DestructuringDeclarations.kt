package com.dicoding.exam.DataClasses3

fun main() {
    val dataUser = DataUser("nrohmen", 17)

    val name = dataUser.component1()
    val age = dataUser.component2()

    // Kita juga dapat membuat beberapa variabel dari objek secara langsung dengan kode seperti berikut:
    val (name2, age2) = dataUser

    println("My name is $name, I am $age years old")
    println("My name is $name2, I am $age2 years old")

    val dataUser2 = DataUser("nrohmen", 23)
    dataUser2.intro()
}
// Author Avriansyah Bahtiar
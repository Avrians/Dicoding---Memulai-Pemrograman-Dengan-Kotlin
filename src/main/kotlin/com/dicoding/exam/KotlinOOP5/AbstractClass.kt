package com.dicoding.exam.KotlinOOP5

abstract class Animal11(var name: String, var weight: Double, var age: Int, var isCarnivore: Boolean){

    fun eat(){
        println("$name sedang makan !")
    }

    fun sleep(){
        println("$name sedang tidur !")
    }
}

fun main(){
    /*
    Ketika kita mencoba membuat objek dari kelas Animal, akan terdapat eror berikut:
    Cannot create an instance of an abstract class
     */
    //    val animal = Animal11("dicoding animal", 2.6, 1, true)
}

// Author Avriansyah Bahtiar

package com.dicoding.exam.KotlinOOP5

class Animal7(private var name: String, private val weight: Double, private val age: Int, private val isMammal: Boolean = true) {

    fun getName() : String {
        return name
    }

    fun setName(newName: String) {
        name = newName
    }

}
open class Animal8(val name: String, protected val weight: Double)

class Cat(pName: String, pWeight: Double) : Animal8(pName, pWeight)

fun main() {
    val dicodingCat = Animal7("Dicoding Miaw", 2.5, 2)
    println(dicodingCat.getName())
    dicodingCat.setName("Gooose")
    println(dicodingCat.getName())

    val cat = Cat("Dicoding Miaw", 2.0)
    println("Nama Kucing: ${cat.name}")
    // println("Berat Kucing: ${cat.weight}") //Cannot access 'weight': it is protected in 'Cat'

    // internal
    // internal class Animal(val name: String)
}

// Author Avriansyah Bahtiar
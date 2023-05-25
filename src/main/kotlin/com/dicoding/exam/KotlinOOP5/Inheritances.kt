package com.dicoding.exam.KotlinOOP5

open class Animal9(val name: String, val weight: Double, val age: Int, val isCarnivore: Boolean){

    open fun eat(){
        println("$name sedang makan!")
    }

    open fun sleep(){
        println("$name sedang tidur!")
    }
}
class Cat2(pName: String, pWeight: Double, pAge: Int, pIsCarnivore: Boolean, val furColor: String, val numberOfFeet: Int)
    : Animal9(pName, pWeight, pAge, pIsCarnivore) {

    fun playWithHuman() {
        println("$name bermain bersama Manusia !")
    }

    override fun eat(){
        println("$name sedang memakan ikan !")
    }

    override fun sleep() {
        println("$name sedang tidur di bantal !")
    }
}

fun main(){
    val dicodingCat = Cat2("Dicoding Miaw", 3.2, 2, true, "Brown", 4)

    dicodingCat.playWithHuman()
    dicodingCat.eat()
    dicodingCat.sleep()
}

/*
output:
    Dicoding Miaw bermain bersama Manusia !
    Dicoding Miaw sedang memakan ikan !
    Dicoding Miaw sedang tidur di bantal !
*/
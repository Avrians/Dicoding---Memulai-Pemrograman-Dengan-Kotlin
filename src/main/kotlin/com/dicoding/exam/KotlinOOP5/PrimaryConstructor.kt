package com.dicoding.exam.KotlinOOP5

class Animal6(var name: String, var weight: Double, var age: Int = 0, var isMammal: Boolean = true)
fun main(){
    val dicodingCat = Animal("Dicoding Miaw", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}" )

    val dicodingCat2 = Animal6("Dicoding Miaw", 4.2)
    /*
    Kita juga dapat secara eksplisit memilih properti yang ingin kita berikan nilai dengan menambahkan nama properti dan tanda = sebelum mengisikan nilai properti.
    val dicodingCat = Animal("Dicoding Miaw", 4.2, isMammal =  true)
     */
    println("Nama: ${dicodingCat2.name}, Berat: ${dicodingCat2.weight}, Umur: ${dicodingCat2.age}, mamalia: ${dicodingCat2.isMammal}" )
}

class Hewan(pName: String, pWeight: Double, pAge: Int, pIsMammal: Boolean){
    val name: String
    val weight: Double
    val age: Int
    val isMammal: Boolean

    init {
        weight = if(pWeight < 0) 0.1 else pWeight
        age = if(pAge < 0) 0 else pAge
        name = pName
        isMammal = pIsMammal
    }
}
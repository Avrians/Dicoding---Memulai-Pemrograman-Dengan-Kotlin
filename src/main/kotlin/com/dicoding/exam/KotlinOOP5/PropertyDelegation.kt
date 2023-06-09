package com.dicoding.exam.KotlinOOP5

import kotlin.reflect.KProperty

class DelegateName {
    private var value: String = "Default"

    operator fun getValue(classRef: Any?, property: KProperty<*>) : String {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any?, property: KProperty<*>, newValue: String){
        println("Fungsi ini sama seperti setter untuk properti ${property.name} pada class $classRef")
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal3 {
    var name: String by DelegateName()
}

class Person3 {
    var name: String by DelegateName()
}

class Hero3 {
    var name: String by DelegateName()
}



class DelegateGenericClass {
    private var value: Any = "Default"

    operator fun getValue(classRef: Any, property: KProperty<*>): Any {
        println("Fungsi ini sama seperti getter untuk properti ${property.name} pada class $classRef")
        return value
    }

    operator fun setValue(classRef: Any, property: KProperty<*>, newValue: Any) {
        println("Nilai ${property.name} dari: $value akan berubah menjadi $newValue")
        value = newValue
    }
}

class Animal4 {
    var name: Any by DelegateGenericClass()
    var weight: Any by DelegateGenericClass()
    var age: Any by DelegateGenericClass()
}

fun main() {
    val animal = Animal3()
    animal.name = "Dicoding Miaw"
    println("Nama Hewan: ${animal.name}")

    val person = Person3()
    person.name = "Dimas"
    println("Nama Orang: ${person.name}")

    val hero = Hero3()
    hero.name = "Gatotkaca"
    println("Nama Pahlawan: ${hero.name}")

    val hewan = Animal4()
    hewan.name = "Dicoding cat"
    hewan.weight = 6.2
    hewan.age = 1

    println("Nama: ${hewan.name}")
    println("Berat: ${hewan.weight}")
    println("Umur: ${hewan.age} Tahun")
}

// Author Avriansyah Bahtiar
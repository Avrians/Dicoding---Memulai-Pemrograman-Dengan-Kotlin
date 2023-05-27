package com.dicoding.exam.KotlinGenerics6

fun main() {
    val longArrayList = ArrayList<Long>()
    val firstLong = longArrayList.get(0)
}

class ArrayList<T> : List<T> {
    override fun get(index: Int): T {
        return this[index]
    }
}

interface List<T> {
    operator fun get(index: Int): T
}

//interface List<P> {
//    operator fun get(index: Int): P
//}


// Author Avriansyah Bahtiar
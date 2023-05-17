package com.dicoding.exam.KotlinFunctional4

fun main() {
    val value: Int? = null

    println(value.slice)
    /*
   output : 0
    */

    val value1: Int? = null

    println(value?.slice)
    println(value1?.slice)
    /*
   output : null
            null
    */

    println(value.slice)
    println(value1.slice)
    /*
   output : 0
            0
    */
}
// elvis operator
val Int?.slice: Int
    get() = this?.div(2) ?: 0

//  if expression
val Int?.sliceiF: Int
    get() = if (this == null) 0 else this.div(2)


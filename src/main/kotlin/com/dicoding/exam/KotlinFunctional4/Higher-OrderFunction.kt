package com.dicoding.exam.KotlinFunctional4

fun main() {
    printResult(10 ,sum)
    /*
   output : 20
    */

    printResult(10){ value ->
        value + value
    }
    /*
    output : 20
    */

    printResult(10){ value ->
        value + value
    }
    printResult(20){ value ->
        value + value
    }

}

inline fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}

var sum: (Int) -> Int = { value -> value + value }


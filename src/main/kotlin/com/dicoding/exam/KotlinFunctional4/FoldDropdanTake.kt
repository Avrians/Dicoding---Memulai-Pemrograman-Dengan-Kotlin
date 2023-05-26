package com.dicoding.exam.KotlinFunctional4

fun main() {
    val numbers = listOf(1, 2, 3)
    val fold = numbers.fold(10) { current, item ->
        println("current $current")
        println("item $item")
        println()
        current + item
    }

    println("Fold result: $fold")

    /*output:
           current 10
           item 1

           current 11
           item 2

           current 13
           item 3

           Fold result: 16
    */

    val fold2 = numbers.foldRight(10) { item, current ->
        println("current $current")
        println("item $item")
        println()
        item + current
    }

    println("Fold 2 result: $fold2")

    /*output:
           current 10
           item 3

           current 13
           item 2

           current 15
           item 1

           Fold 2 result: 16
    */

    val number = listOf(1, 2, 3, 3,4, 5, 6)
    val drop = number.drop(3)

    println(drop)
    /*
       output: [4, 5, 6]
    */

    val drop2 = number.dropLast(3)

    println(drop2)

    /*
       output: [1, 2, 3]
    */

    val total = listOf(1, 2, 3, 4, 5, 6)
    val take = total.take(3)

    println(take)

    /*
       output: [1, 2, 3]
    */

    val take2 = total.takeLast(3)

    println(take2)

    /*
       output: [4, 5, 6]
    */
}

// Author Avriansyah Bahtiar
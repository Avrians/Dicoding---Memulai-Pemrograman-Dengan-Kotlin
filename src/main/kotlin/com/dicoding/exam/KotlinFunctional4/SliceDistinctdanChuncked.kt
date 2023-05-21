package com.dicoding.exam.KotlinFunctional4

fun main() {
    /*
    ================= Slice
     */

    val total = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    val slice = total.slice(3..6)

    println(slice)

    /*
       output: [4, 5, 6, 7]
    */

    val slice2 = total.slice(3..6 step 2)

    println(slice2)

    /*
       output: [4, 6]
    */

    val index = listOf(2, 3, 5, 8)
    val slice3 = total.slice(index)

    println(slice3)

    /*
       output: [3, 4, 6, 9]
    */

    /*
    ================= Distinct
     */

    val total2 = listOf(1, 2, 1, 3, 4, 5, 2, 3, 4, 5)
    val distinct = total2.distinct()

    println(distinct)

    /*
       output: [1, 2, 3, 4, 5]
    */
    data class Item(val key: String, val value: Any)

    val items = listOf(
        Item("1", "Kotlin"),
        Item("2", "is"),
        Item("3", "Awesome"),
        Item("3", "as"),
        Item("3", "Programming"),
        Item("3", "Language")
    )

    val distinctItems = items.distinctBy { it.key }
    distinctItems.forEach {
        println("${it.key} with value ${it.value}")
    }

    /*
       output:
           1 with value Kotlin
           2 with value is
           3 with value Awesome
    */

    val text = listOf("A", "B", "CC", "DD", "EEE", "F", "GGGG")
    val distinct2 = text.distinctBy {
        it.length
    }

    println(distinct2)

    /*
       output: [A, CC, EEE, GGGG]
    */

    /*
    ================= Chunked
     */
    val word = "QWERTY"
    val chunked = word.chunked(2)

    println(chunked)

    /*
       output:[QWE, RTY]
    */

    val chunkedTransform = word.chunked(3) {
        it.toString().toLowerCase()
    }

    println(chunkedTransform)

    /*
       output: [qwe, rty]
    */
}
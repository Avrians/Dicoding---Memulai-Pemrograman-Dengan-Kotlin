package com.dicoding.exam.KotlinOOP5
import kotlin.NumberFormatException

fun main() {
    val someNullValue: String? = null
    lateinit var someMustNotNullValue: String

    // try catch
//    try {
//        someMustNotNullValue = someNullValue!!
//        println(someMustNotNullValue)
//    } catch (e: Exception) {
//        someMustNotNullValue = "Nilai String Null"
//        println(someMustNotNullValue)
//    }

    try {
        someMustNotNullValue = someNullValue!!
    } catch (e: Exception) {
        someMustNotNullValue = "Nilai String Null"
    } finally {
        println(someMustNotNullValue)
    }

    val someStringValue: String? = "12.0"
    var someIntValue: Int = 0

    try {
        someIntValue = someStringValue!!.toInt()
    } catch (e: NullPointerException) {
        someIntValue = 0
    } catch (e: NumberFormatException) {
        someIntValue = -1
    } finally {
        when(someIntValue){
            0 -> println("Catch block NullPointerException terpanggil !")
            -1 -> println("Catch block NumberFormatException terpanggil !")
            else -> println(someIntValue)
        }
    }
}
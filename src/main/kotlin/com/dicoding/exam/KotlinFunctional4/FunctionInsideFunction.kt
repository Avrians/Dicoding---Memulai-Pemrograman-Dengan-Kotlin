package com.dicoding.exam.KotlinFunctional4

fun main() {
//    fun setWord(message: String) {
//        fun printMessage(text: String) {
//            println(text)
//        }
//
//        printMessage(message)
//    }

    // kode diatas bisa disederhanakan lagi menjadi
    fun setWord(message: String) {
        fun printMessage() {
            println(message)
        }

        printMessage()
    }

//    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
//        if (valueA == 0) {
//            throw IllegalArgumentException("valueA must be better than 0")
//        }
//
//        if (valueB == 0) {
//            throw IllegalArgumentException("valueB must be better than 0")
//        }
//
//        if (valueC == 0) {
//            throw IllegalArgumentException("valueC must be better than 0")
//        }
//
//        return valueA + valueB + valueC
//    }

    // kode di atas tidak efektik kita bisa memanfaatkan inner function
    fun sum(valueA: Int, valueB: Int, valueC: Int): Int {
        fun validateNumber(value: Int) {
            if (value == 0) {
                throw IllegalArgumentException("value must be better than 0")
            }
        }
        validateNumber(valueA)
        validateNumber(valueB)
        validateNumber(valueC)

        // extensions function
        fun Int.validateNumber(){
            if (this == 0) {
                throw IllegalArgumentException("value must be better than 0")
            }
        }

        valueA.validateNumber()
        valueB.validateNumber()
        valueC.validateNumber()



        return valueA + valueB + valueC
    }
}
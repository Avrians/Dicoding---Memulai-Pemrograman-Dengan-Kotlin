package com.dicoding.exam.KotlinFundamental1

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    /*
    Contoh 1
    Conjunction atau AND (&&)
    Operator AND (&&) akan mengembalikan nilai true jika semua hasil evaluasi expression yang diberikan bernilai true.
     */
    println("===Contoh 1===")

    val isOpen = if (now >= officeOpen && now <= officeClosed){
        true
    } else {
        false
    }
    // If expressions di atas bisa Anda sederhanakan jadi seperti berikut:
    //     val isOpen = now >= officeOpen && now <= officeClosed

    print("Office is open : $isOpen")

    /*
        Output : Office is open : false
     */

    /*
    Contoh 2
    Disjunction atau OR (||)
    operator OR (||) akan mengembalikan nilai true jika hasil evaluasi dari salah satu expressions yang diberikan bernilai true
    */
    println("\n\n===Contoh 2===")

    val isClose = now < officeOpen || now > officeClosed

    print("Office is closed : $isClose")
    /*
        Output : Office is closed : true
     */

    /*
    Contoh 3
    Negation atau NOT (!)
    operator NOT(!) digunakan untuk melakukan negasi pada hasil evaluasi expression yang diberikan. Contoh, Jika hasil expressions setelah dievaluasi bernilai true, maka operator NOT akan mengembalikan nilai false.
    */
    println("\n\n===Contoh 3===")
    val now2 = 10
    val isOpen2 = now2 > officeOpen

    if (!isOpen2) {
        println("Office is closed")
    } else {
        println("Office is open")
    }

    /*
        Output : Office is open
     */
}
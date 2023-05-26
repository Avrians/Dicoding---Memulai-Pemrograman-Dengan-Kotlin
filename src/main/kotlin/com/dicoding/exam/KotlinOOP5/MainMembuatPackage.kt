package com.dicoding.exam.KotlinOOP5

import  com.dicoding.exam.KotlinOOP5.membuatpackage.*

// atau kita bisa langsung memanggil semua function dengan cara ini
//import com.dicoding.exam.KotlinOOP5.membuatpackage.sayHello
//import com.dicoding.exam.KotlinOOP5.membuatpackage.PI
//import com.dicoding.exam.KotlinOOP5.membuatpackage.pow
//import com.dicoding.exam.KotlinOOP5.membuatpackage.factorial


fun main(){

    // atau bisa seperti ini
    // com.dicoding.exam.KotlinOOP5.membuatpackage.sayHello()

    sayHello()
    println(factorial(4.0))
    println(pow(3.0, 2.0))
    println(PI)
    println(areaOfCircle(13.0))
}

/*
Output:
    Hello From package com.dicoding.oop.utils
*/



// Author Avriansyah Bahtiar
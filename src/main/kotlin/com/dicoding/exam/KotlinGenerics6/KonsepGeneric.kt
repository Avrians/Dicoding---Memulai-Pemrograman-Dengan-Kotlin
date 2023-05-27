package com.dicoding.exam.KotlinGenerics6

val contributor = listOf<String>("jasoet", "alfian","nrohmen","dimas","widy")

// atau bisa kita sederhanakan menjadi
// val contributor = listOf("alfian","nrohmen","dimas","widy")

// jika tidak ada datanya maka kita wajib menambhkan tipe data
val contributor2 = listOf<String>()

val points = mapOf<String, Int>( "alfian" to 10 , "dimas" to 20 )

// Author Avriansyah Bahtiar
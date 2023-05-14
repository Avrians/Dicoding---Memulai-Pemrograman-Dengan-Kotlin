package com.dicoding.exam.DataClasses3

class User(val name : String, val age : Int){

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as User

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("nrohmen", 17)
    val dataUser = DataUser("nrohmen", 17)

    println(user)
    println(dataUser)

    // kelebihan lain dari data class adalah ia sudah memiliki fungsi equals() secara otomatis.
    val dataUser2 = DataUser("nrohmen", 17)
    val dataUser3 = DataUser("dimas", 24)

    println(dataUser.equals(dataUser2))
    println(dataUser.equals(dataUser3))

    //Lain halnya jika kita melakukan komparasi pada 2 buah objek yang bukan dari data class. Kita tidak bisa mendapatkan hasil yang akurat karena konsol akan selalu menghasilkan nilai false.
    val user2 = User("nrohmen", 17)
    val user3 = User("dimas", 24)

    println(user.equals(user2))
    println(user.equals(user3))

    // Sub Bab Menyalin dan Memodifikasi Data Class
    val dataUser4 = dataUser.copy()
    println(dataUser4)

    val dataUser5 = dataUser.copy(age = 18)
    println(dataUser5)
}
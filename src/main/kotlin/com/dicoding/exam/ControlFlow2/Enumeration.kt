package com.dicoding.exam.ControlFlow2

fun main() {
    val color : Color = Color.RED
    println(color)
    /*
   output: RED
    */

    val colors: Array<Color> = Color.values()
    colors.forEach { color ->
        print("$color ")
    }
    println("")
    /*
   output : RED GREEN BLUE
    */

    val color2: Color = Color.valueOf("RED")
    println("Color is $color2")
    println("Color value is ${color2.value.toString(16)}")

    /*
       output :
       Color is RED
       Color value is ff0000
    */

    val colors2: Array<Color> = enumValues()
    colors2.forEach {color3 ->
        println(color3)
    }

    val color3: Color = enumValueOf("GREEN")
    println("Color is $color3")
    /*
   output :
       RED
       GREEN
       BLUE
       Color is RED
    */

    println("Position GREEN is ${color3.ordinal}")
    /*
   output : Position GREEN is 1
    */

    // Ketika menggunakan when untuk mengecek instance dari Enum, lebih baik masukkan setiap objek Enum yang kita definisikan. Jika kita melewatkan salah satu objek,  peringatan berikut akan muncul: ‘when' expression on enum is recommended to be exhaustive
    when(color3){
        Color.RED -> println("Color is Red")
        Color.BLUE -> println("Color is Blue")
        Color.GREEN -> println("Color is Green")
    }
    /*
   output : Color is Green
   */
}

enum class Color(val value: Int) {
    RED(0xFF0000),
    GREEN(0x00FF00),
    BLUE(0x0000FF)
}

package com.example

import kotlin.math.roundToInt


fun main() {

    // Основные типы данных
    // var  - variable
    // val  - value


    //Можно изменять

    var v3:  Int = 214748364// 32 бит
    var v4: Long = 9223372036854775807 // 64 бита
    var v6: Double = 14.5 // 64 бита
    var v7: Char = 'h' // 0 - 65535
    var v8: String = "asdasd"
    var v9: Boolean = true // или false 1 бит

    v3 = v7.toInt()

    v8 = v3.toString()

    println(v8+2)
    //Можно не менять

    val val3: Int = 2147483647// 32 бит
    val val4: Long = 9223372036854775807 // 64 бита
    val val6: Double = 1.7E+308 // 64 бита
    val val7: Char = 'a' // 0 - 65535
    val val8: String = "asdasd"
    val val9: Boolean = true // или false 1 бит


}
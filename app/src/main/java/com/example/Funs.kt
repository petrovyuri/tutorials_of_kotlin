package com.example

fun main() {
    var a = 10
    var b = 9
    var result = summa(a, b)
    println(result)
}

fun summa(param1: Int, param2: Int): Int {
    return param1 + param2
}

fun tolya(nails: Int, tap: Int) {
    println("Снят старую сантехнику")
    println("ЗАменить отводы")
    println(" И еще работу .....")
    println("Установить новую сантехнику")
    println("$nails и $tap")
}

fun vasya(nails: Int, tap: Int): String {
    println("Снять старый паркет")
    println(" И еще работу .....")
    println("Установить новый паркет")
    println("$nails и $tap")
    return "АКТ о выполнении"
}
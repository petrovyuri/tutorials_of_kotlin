package com.example

fun main() {
    var a = 10

    var lam = {
        a++
    }

    println(a)
    lam()
    println(a)
}
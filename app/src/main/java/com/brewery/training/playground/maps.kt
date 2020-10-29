package com.brewery.training.playground


fun main() {
    val map = mapOf(Pair("a", 1), "b" to 2, "c" to 2)
    println(map)

    for ((key,value) in map) {
        println("$key maps to $value")
    }
}
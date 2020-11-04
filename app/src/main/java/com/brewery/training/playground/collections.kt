package com.brewery.training.playground

fun main() {
    val map = mapOf(Pair("x", 1), "y" to 2, "z".to(2))
    println(map)

    for ((k,v) in map) {
        println("$k maps to $v")
    }

    for (entry in map) {
        println(entry)  // Map.Entry toString
    }

    for (entry in map) {
        println(entry.toPair())  // Pair toString
    }

    val nums = linkedSetOf(3, 1, 4, 1, 5, 9)
    println(nums)
    println(nums::class)
    println(nums::class.java)
}
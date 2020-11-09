package com.brewery.training.playground

fun main() {
    for (i in 1..10) {
        when (i % 3) {
            0 -> println("$i is divisible by 3")
            1 -> println("$i % 3 == 1")
            2 -> println("$i % 3 == 2")
        }
    }

    for (i in 1..10) {
        val result = when (i % 3) {
            0 -> "$i is divisible by 3"
            1 -> "$i % 3 == 1"
            2 -> "$i % 3 == 2"
            else -> "Houston, we have a problem..."
        }
        println(result)
    }
}
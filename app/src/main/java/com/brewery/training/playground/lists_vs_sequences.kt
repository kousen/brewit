package com.brewery.training.playground

fun main() {
    val numbers = List(6) { 100 + it }

    println("Using a list:")
    numbers.filter { println("filter with n=$it"); it % 3 == 0 }
        .map { println("map with n=$it"); it * 2 }
        .first().also(::println)

    println("\nUsing a sequence:")
    numbers.asSequence()
        .filter { println("filter with n=$it"); it % 3 == 0 }
        .map { println("map with n=$it"); it * 2 }
        .first().also(::println)

    // No data processed without a terminal operation
    numbers.asSequence()
        .filter { println("filter with n=$it"); it % 3 == 0 }
        .map { println("map with n=$it"); it * 2 }
        .also(::println)
}
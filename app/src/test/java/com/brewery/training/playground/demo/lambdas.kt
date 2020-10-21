package com.brewery.training.playground.demo

fun main() {
    val nums = listOf(3, 1, 4, 1, 5, 9)

    // Modifying shared mutable state
    var total = 0  // In Java, local vars must be final or "effectively final"
    nums.forEach { n -> total += n }
    println("The total is $total")

    // The better way
    val sum = nums.sum()

    val plus = { x: Int, y: Int -> x + y }

    val valuecoerceIn = 42.coerceIn(20, 40)

    nums.filter { it % 3 == 0 }
        .map { it * 2 }
        .sum()

    nums.asSequence().filter { it % 3 == 0 }
        .map { it * 2 }
        .sum()
}
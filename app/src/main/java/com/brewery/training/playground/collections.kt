package com.brewery.training.playground

import kotlin.math.sqrt

// Top-level function
fun isOdd(x: Int) =  x % 2 != 0

fun main() {
    val numbers = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5)
    // filter with a lambda
    println(numbers.filter { isOdd(it) })

    // filter with a lambda with named arguments
    println(numbers.filter { isOdd(x = it) })

    // filter with a multiline lambda
    println(numbers.filter { n ->
        isOdd(n)
    })

    // filter with a function reference
    println(numbers.filter(::isOdd))

    val squares = Array(5) { i -> i * i }
    println(squares.toList())

    sqrt(4.toDouble())
    val n: Double = 3.toDouble()
}
package com.brewery.training.playground

fun fibonacci(n: Long) =
    (2..n + 1).fold(1 to 0) { (prev, curr), _ ->
        println(curr)
        curr to (prev + curr)
    }.second

// 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
fun main() {
    println(fibonacci(10))
}
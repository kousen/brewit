package com.brewery.training.playground

fun fibonacciFold(n: Long) =
    (2 until n).fold(1L to 1L) { (prev, curr), x ->
        println("$x: curr to (prev + curr): ${curr to (prev + curr)}")
        curr to (prev + curr)
    }.second

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
fun main() {
    println(fibonacciFold(100))

    val arrayOfNullStringSearch = arrayOfNulls<String>(5)
}
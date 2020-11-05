package com.brewery.training.playground

fun fibonacciFold(n: Long) =
    (2..n + 1).fold(1 to 0) { (prev, curr), _ ->
        curr to (prev + curr)
    }.second

// 1, 1, 2, 3, 5, 8, 13, 21, 34, 55
fun main() {
    println(fibonacciFold(100))

    val arrayOfNullStringSearch = arrayOfNulls<String>(5)
}
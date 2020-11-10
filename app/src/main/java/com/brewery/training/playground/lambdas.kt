package com.brewery.training.playground

import java.util.stream.Collectors

fun isOdd(x: Int) = x % 2 != 0

fun main() {
    val nums = listOf(3, 1, 4, 1, 5, 9, 2, 6, 5)
    nums.filter { num -> isOdd(num) }.also(::println)
    nums.filter { isOdd(it) }.also(::println)
    nums.filter(::isOdd).also(::println)


    val sum = { x: Int, y: Int ->
        println("The values of x and y are ($x,$y)")
        x + y  // the last evaluated expression is returned automatically
    }

    println(sum(3, 4))

    val strings = listOf("this", "is", "a", "list", "of", "strings")
    val lengths = strings.map { s -> s.length }
    println(lengths)
    println(strings.filter { s -> s.length % 2 == 0 })

    val evenLengthFilter = { s: String -> s.length % 2 == 0 }

    strings.map { it.length }    // returns List<Int>, the lengths
        .filter { it % 2 == 0 }  // returns List<Int> for only divisble by 3 values
        .forEach { println(it) } // prints each value to a separate line

    strings.parallelStream()
        .map { it.length }
        .filter { it % 2 == 0 }
        .collect(Collectors.toList())

    strings.asSequence()
        .map { it.length }
        .filter { it % 2 == 0 }
        .toList()

    repeat(5, { number -> println("Iteration $number") })
    repeat(5) { number -> println("Iteration $number") }
}
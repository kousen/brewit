package com.brewery.training.playground

fun main() {
    val strings = arrayOf("this", "is", "an",
        "array", "of", "strings")

    for (string in strings) {
        println(string)
    }

    for (i in strings.indices) {
        println("index $i returns ${strings[i]}")
    }

    for (iv in strings.withIndex()) {
        println("value at ${iv.index} is ${iv.value}")
    }

    // destructuring
    for ((idx, s) in strings.withIndex()) {
        println("value at $idx is $s")
    }
}
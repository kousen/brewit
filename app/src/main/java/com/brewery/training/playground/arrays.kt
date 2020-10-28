package com.brewery.training.playground

fun main() {
    val strings = arrayOf("this", "is", "in", "an",
        "array", "of", "strings")

    println(strings[0])
    strings[0] = "these"
    strings[1] = "are"
    println(strings.toList())

    for (s in strings) {
        println(s)
    }

    for (i in strings.indices) {
        println("The string at index $i is ${strings[i]}")
    }

    for ((idx, value) in strings.withIndex()) {
        println("$idx element is $value")
    }
}
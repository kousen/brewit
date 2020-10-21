package com.brewery.training.playground.demo

fun main() {
    val strings = arrayOf("this", "is", "an", "array", "of", "strings")
    for (s in strings) {
        println(s)
    }

    for (i in strings.indices) {
        println("String at index $i is ${strings[i]}")
    }

    for ((index, string) in strings.withIndex()) {
        println("$index -> $string")
    }
}
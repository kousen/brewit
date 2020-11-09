package com.brewery.training.playground

fun main() {
    val strings = arrayOf("this", "is", "an", "array", "of", "strings")
    for (s in strings) {
        println(s)
    }

    println(strings.toList())

    for (i in strings.indices) {
        println("value at index $i is ${strings[i]}")
    }

    for (iv in strings.withIndex()) {
        println("${iv.index} holds ${iv.value}")
        println(iv)
    }

    // Destructuring
    // component1, component2, ...
    // IndexedValue has component1() --> index, component2() --> value
    for ((idx,vlu) in strings.withIndex()) {
        println("$idx holds $vlu")
    }
}
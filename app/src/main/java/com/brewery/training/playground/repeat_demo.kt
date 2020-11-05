package com.brewery.training.playground

fun main() {
    repeat(3) {
        println("Hi there on iteration $it")
    }

    repeat(3, { println("Hi there on iteration $it") })

    repeat(3) { index -> println("Hi there on iteration $index") }
}
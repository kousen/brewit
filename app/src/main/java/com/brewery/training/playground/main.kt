@file:JvmName("Utilities")

package com.brewery.training.playground

fun getGreeting(name: String) = "Hello, $name!"

fun main(args: Array<String>) {
    println(getGreeting("Dolly"))
}

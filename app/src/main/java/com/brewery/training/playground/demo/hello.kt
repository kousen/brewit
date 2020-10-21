@file:JvmName("Utilities")

package com.brewery.training.playground.demo

import java.util.*

// \w --> a-ZA-Z0-9_
fun String.isPalindrome() =
    this.toLowerCase(Locale.getDefault())
        .replace("""[\W+_]""".toRegex(), "")
        .let { testString -> testString == testString.reversed() }

class Greeter(val name: String) {
    fun greet() {
        println("Hello, $name!")
    }
}

// public static void main(String[] args)
fun main(args: Array<String>) =
    if (args.isNotEmpty()) {
        val name = args[0]
        Greeter(name).greet()
    } else {
        Greeter("World").greet()
    }

package com.brewery.training.playground

import kotlin.random.Random

class SafeCastDemo(val string: String?) {

    val length: Int
        get() = string?.length ?: 0

    // fun getLength() =
//        if (string != null) {
//            string.length
//        } else 0

        // string?.length ?: 0  // not a problem
}


// (boolean condition) ? value : else_condition
// Kotlin does not have the ternary operator
//  ... but it doesn't need it, because the if statement
//      already returns a value

fun getLength(string: String?) =
    // non-null assertion operator
//    string!!.length

    // safe call + Elvis
    string?.length ?: 0  // safe call with Elvis

// Uses an if-else statement
//    if (string != null) {
//        string.length
//    } else 0

fun main() {
    println(getLength("abc"))
    println(getLength(""))
    println(getLength(null))

    val x = Random.nextInt(10, 20)
    when (x % 2) {
        0 -> println("$x is even")
        1 -> println("$x is odd")
    }

    // Must be exhaustive because we are returning a value
    val result = when (x % 2) {
        0 -> "$x is even"
        1 -> "$x is odd"
        else -> "Houston, we have a problem..."
    }

}
package com.brewery.training.playground

import java.util.*

fun isPalindrome(string: String): Boolean {
    val testString = string.toLowerCase(Locale.getDefault())
        .replace("""[\W+_]""".toRegex(), "")
    return testString == testString.reversed()
}

fun String.isPal() =
    this.toLowerCase(Locale.getDefault())
        .replace("""[\W+_]""".toRegex(), "")
        .let { it == it.reversed() }
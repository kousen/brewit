package com.brewery.training.playground.demo

import java.text.NumberFormat
import kotlin.math.sqrt

fun sqrt(x: Int) = sqrt(x.toDouble())

@JvmOverloads
fun addProduct(name: String, price: Double = 0.0, desc: String? = null) =
    "Adding product with $name, ${desc ?: "None" }, and " +
            NumberFormat.getCurrencyInstance().format(price)

fun main() {
    sqrt(4)

    val numList = listOf(100, 101, 102, 103, 104, 105, 106)

    val firstFromSequence = numList.asSequence()
        .filter { println("mod 3 of $it"); it % 3 == 0 }
        .map { println("doubling $it"); it * 2 }
        .first()
    println(firstFromSequence)

    val firstFromList = numList
        .filter { println("mod 3 of $it"); it % 3 == 0 }
        .map { println("doubling $it"); it * 2 }
        .first()
    println(firstFromList)
}
package com.brewery.training.playground

fun main() {
    val nums = listOf(101, 102, 103, 104, 105, 106)

    // Short-circuits after the first element makes it through
    nums.filter { println("Inside filter: $it"); it % 3 == 0 }
        .map { println("Inside map: $it"); it * 2 }
        .first().also(::println)

    nums.asSequence()
        .filter { println("Inside filter: $it"); it % 3 == 0 }
        .map { println("Inside map: $it"); it * 2 }
        .first().also(::println)

    // Still processes all the elements
    nums.filter { println("Inside filter: $it"); it % 3 == 0 }
        .map { println("Inside map: $it"); it * 2 }
        .also(::println)

    nums.asSequence()
        .filter { println("Inside filter: $it"); it % 3 == 0 }
        .map { println("Inside map: $it"); it * 2 }
        .toList().also(::println)
}
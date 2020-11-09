@file:JvmName("Utilities")

package com.brewery.training.playground

class Person(val name: String, val age: Int)

fun createPerson(n: String, a: Int) = Person(n, a)

fun getGreeting(name: String) = "Hello, $name!"

fun nullability(x: String, y: String?) {
    // Not-null variable
    println(x.length)

    // Nullable with an if check
    if (y != null) {
        println(y.length)
    }

    // Safe call operator
    println(y?.length)

    // Elvis operator
    println(y?.length ?: 0)

    // Non-null asserted call
    println(y!!.length)
}

fun main(args: Array<String>) {
    val person = createPerson("Jean-Luc", 42)
    val p1: Person
    p1 = createPerson("Wesley", 16)

    // val p2 = null

    println(getGreeting(
            if (args.isNotEmpty()) args[0] else "World"
        )
    )

    var a = "hello"
    val b = a + 10
    println("a = $a, b = $b")
    a = "whatever"

    val c = 10
    val d = "abc" + c
    println("c = $c, d = $d")

}

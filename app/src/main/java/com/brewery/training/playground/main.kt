// @file:JvmName("Utilities")
package com.brewery.training.playground

fun sayHello(name: String) = "Hello, $name!"

fun useNullableString(arg: String?) {

}

val sum: (Int, Int) -> Int = { x: Int, y: Int -> x + y }

fun isOdd(x: Int) = x % 2 != 0

fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3, 4, 5)
    println(numbers.filter(::isOdd))
    println(numbers.filter { num -> isOdd(num) })

    println("Hello, ${if (args.isNotEmpty()) args[0] else "World"}!")
    println(sayHello("Dolly"))
    var personName: String? = "Fred"
    if (personName != null) {
        sayHello(personName)
    }
    personName = "Wilma"
    val s = "abc"
    useNullableString(s)
}
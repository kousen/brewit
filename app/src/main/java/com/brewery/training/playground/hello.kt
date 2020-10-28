@file:JvmName("Utilities")
package com.brewery.training.playground

// Want a greeting(name: String) that returns "Hello, " + name + "!"
@JvmOverloads
fun greeting(name: String = "World") = "Hello, $name!"

fun main(args: Array<String>) {
    /// name = (args.length != 0) ? args[0] : "World"
    // val name = if (args.isNotEmpty()) args[0] else "World"
    var name: String? = null;
    println(
        if (args.isNotEmpty())
            greeting(args[0])
        else
            greeting()
    )
}
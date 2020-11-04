// @file:JvmName("Utilities")
package com.brewery.training.playground

fun sayHello(name: String) = "Hello, $name!"

fun useNullableString(arg: String?) {

}

fun main(args: Array<String>) {
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
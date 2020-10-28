package com.brewery.training.playground

class SmartCastDemo(var string: String?) {
    // fun len() = if (string != null) string.length else 0
    fun len() = string?.length ?: 0
}

fun getLength(str: String?) = str?.length ?: 0
//    str!!.length
//    if (str != null)
//        str.length
//    else 0

//fun `fun with a string name`() {
//
//}

fun main() {
    println(getLength(""))
    println(getLength(null))
    println(getLength("hello"))
}
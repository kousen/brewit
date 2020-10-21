package com.brewery.training.playground.demo

class MyClass(var str: String?){
    fun getStringLength(): Int {
//        if (str != null) {
//            return str.length
//        }
        return str?.length ?: 0
    }
}

fun getLength(s: String?) =
    // s?.length ?: 0
    if (s != null) s.length else 0
    // s!!.length

fun main() {
    getLength(null)
    val n: Int = 3
    val m: Int? = null

    val x: Long = n.toLong()

    // Integer a = Integer.valueOf(3);
    // Long b = a;

    val str = """interpolated "string" ${"$"}n"""
    println(str)
}
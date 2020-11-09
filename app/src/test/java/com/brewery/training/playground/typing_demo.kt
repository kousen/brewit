package com.brewery.training.playground

class Test {
    fun dummyMethod() {
        println("dummy method")
    }
}
fun main() {

    val testArrays = arrayOf(Test(), "Hello", 10, 5, Test())

    for (b in testArrays) {
        println(b)
        // b.dummyMethod()   // Error here
    }

}
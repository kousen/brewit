package com.brewery.training.playground

data class Employee(val name: String, val email: String, val salary: Double) {
    override fun toString() = "($name, $email, $salary)"
}

fun main() {
    val emp1 = Employee("Fred", "flintstone@bedrock.org", 52000.0)
    val emp2 = Employee("Fred", "flintstone@bedrock.org", 52000.0)
    val emp3 = emp1

    // int --> double, no problem
    // Integer --> Double (using wrapper classes) --> doesn't work

    // Calling toString()
    println(emp1)
    println(emp2)
    // operator overloading --> the == operator invokes the equal(Any) function
    println("Equivalence                 : ${emp1 == emp2}")
    println("Identity (refrence equality): ${emp1 === emp2}")
    println("Identity (refrence equality): ${emp1 === emp3}")

    val wilma = emp1.copy(name = "Wilma")
    println(wilma)

    // data classes provide:
    // - toString, equals, hashCode
    // - copy function as a copy-constructor
    // - componentN functions for destructuring
}


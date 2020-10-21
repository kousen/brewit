package com.brewery.training.playground.demo

import java.text.NumberFormat
import java.time.LocalDate
import java.time.Month

data class Person(val name: String, val dob: LocalDate)

class Employee(val name: String, val salary: Double) {
    operator fun component1() = name
    operator fun component2() = salary
}

fun main() {
    val jeanLuc1 = Person("Jean-Luc Picard",
        LocalDate.of(2305, Month.JULY, 13))
    println(jeanLuc1)

    val jeanLuc2 = Person(name = "Jean-Luc Picard",
        dob = LocalDate.of(2305, Month.JULY, 13))

    println("Equivalence : " + (jeanLuc1 == jeanLuc2))
    println("Ref equality: " + (jeanLuc1 === jeanLuc2))

    val wesley = jeanLuc1.copy(name = "Wesley Crusher")
    val baby = jeanLuc1.copy(dob = LocalDate.now())
    println(wesley)
    println(baby)

    val (n,d) = jeanLuc1
    println("n = $n, d = $d")

    val emp = Employee("Will Riker", 250_000.0)
    val (empName, empSalary) = emp
    println("$empName is making ${NumberFormat.getCurrencyInstance().format(empSalary)}")
}
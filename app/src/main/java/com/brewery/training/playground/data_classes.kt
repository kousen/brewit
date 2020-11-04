package com.brewery.training.playground

import java.time.LocalDate
import java.time.Month

data class Customer(
    val first: String,
    val last: String,
    val dob: LocalDate
)

fun main() {
    val fred1 = Customer("Fred", "Flintstone",
        LocalDate.of(1907, Month.AUGUST, 20))

    println(fred1)

    val fred2 = Customer("Fred", "Flintstone",
        LocalDate.of(1907, Month.AUGUST, 20))

    println(fred1 == fred2)   // equivalence (delegates to the .equals(Any) function)
    println(fred1 === fred2)  // reference equality (identity), delegates to the "is" function

    val wilma = fred1.copy(first = "Wilma",
        dob = LocalDate.of(1947, Month.OCTOBER, 12))

    println(wilma)

    val (frst, lst, db) = wilma
    println("$frst $lst, born on $db")
}
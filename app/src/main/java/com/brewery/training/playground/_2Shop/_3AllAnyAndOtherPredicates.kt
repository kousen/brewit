package com.brewery.training.playground._2Shop

fun main() {
    val list = listOf(-1, 3, 0, -5, 7)

    val isZero: (Int) -> Boolean = { it == 0 }

    val hasZero: Boolean = list.any(isZero)
    println(hasZero)  // true

    val allZeros: Boolean = list.all(isZero)
    println(allZeros)  // false

    val numberOfZeros: Int = list.count(isZero)
    println(numberOfZeros)  // 1

    val firstPositiveNumber: Int? = list.firstOrNull { it > 0 }
    println(firstPositiveNumber) // 3
}

// Return true if the customer is from the given city
fun Customer.isFrom(city: City): Boolean {
    // TODO()
    return this.city == city
}

// Return true if all customers are from the given city
fun Shop.checkAllCustomersAreFrom(city: City): Boolean {
    // TODO()
    return customers.all { it.city == city }
}

// Return true if there is at least one customer from the given city
fun Shop.hasCustomerFrom(city: City): Boolean {
    // TODO()
    return customers.any { it.city == city }
}

// Return the number of customers from the given city
fun Shop.countCustomersFrom(city: City): Int {
    // TODO()
    return customers.count { it.city == city }
}

// Return a customer who lives in the given city, or null if there is none
fun Shop.findAnyCustomerFrom(city: City): Customer? {
    // TODO()
    return customers.find { it.city == city }
}
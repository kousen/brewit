package com.brewery.training.playground._2Shop

import kotlinx.coroutines.processNextEventInCurrentThread

fun main() {
    val result = listOf("abc", "12").flatMap(String::toList)

    result == listOf('a', 'b', 'c', '1', '2')

    println(result)   // [a, b, c, 1, 2]
}

// Return all products that were ordered by customer
val Customer.orderedProducts: Set<Product>
    get() {
        // TODO()
        return orders.flatMap(Order::products).toSet()
    }

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product>
    get() {
        // TODO()
        return customers.flatMap(Customer::orderedProducts).toSet()
    }

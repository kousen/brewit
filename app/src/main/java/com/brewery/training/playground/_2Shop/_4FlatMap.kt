package com.brewery.training.playground._2Shop

fun main() {
    val result = listOf("abc", "12").flatMap(String::toList)

    result == listOf('a', 'b', 'c', '1', '2')

    println(result)   // [a, b, c, 1, 2]

    val listOfLists = listOf(listOf("a", "bbb", "cc"), listOf("1", "22"))
    listOfLists.flatMap { list -> list.toList() }.also(::println)
}

// Return all products that were ordered by customer
val Customer.orderedProducts: Set<Product> get() {
    return orders.flatMap { it.products }.toSet()
}

// Return all products that were ordered by at least one customer
val Shop.allOrderedProducts: Set<Product> get() {
    return customers.flatMap { it.orderedProducts }.toSet()
}

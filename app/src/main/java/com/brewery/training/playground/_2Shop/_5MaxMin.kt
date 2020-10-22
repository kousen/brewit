package com.brewery.training.playground._2Shop

fun main() {
    val max = listOf(1, 42, 4).max()
    val longestString = listOf("a", "ab", "b").maxBy { it.length }
    listOf("a", "ab", "b").maxWith(Comparator { s1, s2 -> s1.length - s2.length })

    println(max) // 42
    println(longestString) // ab
}

// Return a customer whose order count is the highest among all customers
fun Shop.getCustomerWithMaximumNumberOfOrders(): Customer? {
    // TODO()
    return customers.maxBy { it.orders.size }
}

// Return the most expensive product which has been ordered
fun Customer.getMostExpensiveOrderedProduct(): Product? {
    // TODO()
    return this.orderedProducts.maxBy { it.price }
}

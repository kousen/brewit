package com.brewery.training.playground._2Shop

fun main() {
    val sum = listOf(1, 5, 3).sum()

    val total = listOf(1.0, 5.0, 3.0).sum()

    println(sum) // 9
}

// Return the sum of prices of all products that a customer has ordered.
// Note: a customer may order the same product for several times.
fun Customer.getTotalOrderPrice(): Double {
    // TODO()
//    return orders.flatMap { it.products }
//        .map { it.price }
//        .sum()

//    return orders.flatMap(Order::products)
//        .sumByDouble(Product::price)

    return orders.sumByDouble { order ->
        order.products.sumByDouble { it.price }
    }
}

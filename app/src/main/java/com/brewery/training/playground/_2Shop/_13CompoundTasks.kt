package com.brewery.training.playground._2Shop

// Return the set of customers who ordered the specified product
fun Shop.getCustomersWhoOrderedProduct(product: Product): Set<Customer> {
    // TODO()
    return customers.filter { it.orderedProducts.contains(product) }.toSet()
}

// Return the most expensive product among all delivered products
// (use the Order.isDelivered flag)
fun Customer.getMostExpensiveDeliveredProduct(): Product? {
    // TODO()
    return orders.filter { it.isDelivered }
        .flatMap { it.products }
        .maxBy { it.price }
}

// Return the number of times the given product was ordered.
// Note: a customer may order the same product for several times.
fun Shop.getNumberOfTimesProductWasOrdered(product: Product): Int {
    // TODO()
//    return customers.flatMap { it.orders }
//        .flatMap { it.products }
//        .count { it == product}

    return customers.fold(0) { total, customer ->
        total + customer.orders
            .flatMap { it.products }
            .count { it == product }
    }
}
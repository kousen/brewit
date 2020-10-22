package com.brewery.training.playground._2Shop

fun main() {
    val result = listOf(1, 2, 3, 4).fold(1, { partResult, element -> element * partResult })
    println(result) // 24 = 1 * 2 * 3 * 4

    val totalfold = listOf(1, 2, 3, 4).fold(0) { acc, n ->
        println("acc=$acc, n=$n")
        acc + n * 2
    }
    println(totalfold)

    val totalReduce = listOf(1, 2, 3, 4).reduce { acc, i ->
        println("acc=$acc, i=$i")
        acc + i * 2
    }
    println(totalReduce)
}

// The same as
fun whatFoldDoes(): Int {
    var result = 1
    listOf(1, 2, 3, 4).forEach { element -> result *= element }
    return result
}

// Return the set of products ordered by every customer
fun Shop.getSetOfProductsOrderedByEveryCustomer(): Set<Product> {
    return customers.fold(allOrderedProducts, { orderedByAll, customer ->
        // TODO()
        orderedByAll.intersect(customer.orderedProducts)
    })
}

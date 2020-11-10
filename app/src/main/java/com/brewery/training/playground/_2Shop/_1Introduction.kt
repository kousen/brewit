package com.brewery.training.playground._2Shop

import java.util.*
import kotlin.collections.HashSet

/*
 * This part of workshop was inspired by:
 * https://github.com/goldmansachs/gs-collections-kata
 */

/*
 *  There are many operations that help to transform one collection into another, starting with 'to'
 */
fun main() {
    val list = listOf(2, 2, 1)
    val set = list.toSet()
    println(set)   // [2, 1]

    val sortedSet = list.toCollection(TreeSet<Int>())
    println(sortedSet) // [1, 2]
}

// Return a set containing all the customers of this shop
fun Shop.getSetOfCustomers(): Set<Customer> {
    return this.customers.toSet()
}


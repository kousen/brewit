package com.brewery.training.playground._2Shop

// Rewrite JavaCode.doSomethingStrangeWithCollection function to Kotlin.
fun doSomethingStrangeWithCollection(collection: Collection<String>): Collection<String>? {

    val groupsByLength = collection.groupBy { s -> s.length }

    return groupsByLength.values.maxBy { group -> group.size }
}


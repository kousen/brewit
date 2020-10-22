package com.brewery.training.playground.demo

import kotlinx.coroutines.async
import kotlinx.coroutines.awaitAll
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val deferred1 = async {
        networkCall(1)
    }
    val deferred2 = async {
        networkCall(2)
    }

    val elapsedTime = measureTimeMillis {
        listOf(deferred1, deferred2).awaitAll()
    }

    println("Results after ${elapsedTime}ms")
}

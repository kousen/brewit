package com.brewery.training.playground.demo

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun main() = runBlocking<Unit> {
    val elapsedTime = measureTimeMillis {
        val job1 = launch {
            networkCall(1)
        }
        val job2 = launch {
            networkCall(2)
        }

        job1.join()
        job2.join()
    }

    println("Results after ${elapsedTime}ms")
}

suspend fun networkCall(n: Long): String {
    delay(500)
    return "response $n"
}
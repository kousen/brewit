package com.brewery.training.playground.coroutines

import kotlinx.coroutines.*

fun main() = runBlocking<Unit> {
    launchWithIO()
    launchWithDefault()
    asyncCall()
}

suspend fun asyncCall() = coroutineScope {
    async(Dispatchers.IO) {
        delay(100L)
        println("Making async call")
        println(Thread.currentThread().name)
    }.await()
}

suspend fun launchWithIO() {
    withContext(Dispatchers.IO) {
        delay(100L)
        println("Using Dispatchers.IO")
        println(Thread.currentThread().name)
    }
}

suspend fun launchWithDefault() {
    withContext(Dispatchers.Default) {
        delay(100L)
        println("Using Dispatchers.Default")
        println(Thread.currentThread().name)
    }
}
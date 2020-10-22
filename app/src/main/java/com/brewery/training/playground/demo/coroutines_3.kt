package com.brewery.training.playground.demo

import kotlinx.coroutines.*
import kotlin.system.measureTimeMillis

val scope = CoroutineScope(Dispatchers.Default)

fun main() = runBlocking<Unit> {
    val elapsedTime = measureTimeMillis {
        val job = scope.launch {
            networkCall(1)
        }

        job.invokeOnCompletion { throwable ->
            if (throwable is CancellationException) {
                println("Coroutine was cancelled")
            }
        }

        job.cancel()
        delay(1000)
        onDestroy()
    }

    println("Results after ${elapsedTime}ms")
}

fun onDestroy() {
    println("Cancelling scope")
    scope.cancel()
}


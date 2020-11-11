package com.brewery.training.playground.coroutines

import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

suspend fun main() {
    GlobalScope.launch {
        networkCall(1).also(::println)
    }
    GlobalScope.launch {
        networkCall(2).also(::println)
    }

    delay(1500)
}
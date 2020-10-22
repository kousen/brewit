package com.brewery.training.playground.demo

import com.brewery.training.viewmodels.AstroResponse
import com.google.gson.Gson
import kotlinx.coroutines.*
import java.net.URL

suspend fun getAstroResponse(): AstroResponse = coroutineScope {
    withContext(Dispatchers.IO) {
        Gson().fromJson(
            URL("http://api.open-notify.org/astros.json").readText()
                .also(::println),
            AstroResponse::class.java
        ).also { response ->
            println("There are ${response.number} people in space")
            for ((n, cr) in response.people) {
                println("$n aboard $cr")
            }
        }
    }
}


fun main() {
    val scope = CoroutineScope(Job())
    val job = scope.launch {
        getAstroResponse()
    }
}
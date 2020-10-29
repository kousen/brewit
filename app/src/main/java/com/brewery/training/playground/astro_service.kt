package com.brewery.training.playground

import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext
import java.net.URL

data class Assignment(
    val name: String,
    val craft: String
)

data class AstroResponse(
    val message: String,
    val number: Int,
    val people: List<Assignment>
)

suspend fun getAstroResponse(): AstroResponse = coroutineScope {
    withContext(Dispatchers.IO) {
        Gson().fromJson(
            URL("http://api.open-notify.org/astros.json").readText(),
            AstroResponse::class.java
        ).also(::println)
    }
}
// .also { Log.d(TAG, it) }

fun main() = runBlocking<Unit> {
    getAstroResponse()
}

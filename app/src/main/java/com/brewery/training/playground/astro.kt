package com.brewery.training.playground

import com.google.gson.Gson
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

fun main() {
    val response = Gson().fromJson(
        URL("http://api.open-notify.org/astros.json").readText(),
        AstroResponse::class.java
    )

    println("There are " + response.number + " people in space right now")
    for ((name, craft) in response.people) {
        println("$name aboard $craft")
    }
}
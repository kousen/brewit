package com.brewery.training.playground.demo

import com.brewery.training.data.Brewery
import com.google.gson.Gson
import kotlinx.coroutines.*
import java.net.URL
import java.net.URLEncoder

val results = mutableMapOf<String, Array<Brewery>>()

fun main() = runBlocking<Unit> {
    getBreweriesByCities("East Hartford", "Waterbury", "Stamford")
    for ((city, breweryArray) in results) {
        println(city)
        breweryArray.forEach(::println)
    }
}

private fun encode(name: String) =
    URLEncoder.encode(name, "UTF-8")

suspend fun getBreweriesByCity(city: String) = coroutineScope {
    launch(Dispatchers.IO) {
        cityToBreweryArray(city)
    }
}

suspend fun getBreweriesByCities(vararg cities: String) = coroutineScope {
    cities.map { city ->
        async(Dispatchers.IO) {
            cityToBreweryArray(city)
        }
    }.awaitAll()
}

private fun cityToBreweryArray(city: String) {
    URL("https://api.openbrewerydb.org/breweries?by_city=${encode(city)}").readText()
        .let { json ->
            results[city] = Gson().fromJson(json, Array<Brewery>::class.java)
        }
}
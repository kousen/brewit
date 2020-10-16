package com.brewery.training.api

import com.brewery.training.data.Brewery
import retrofit2.http.GET
import retrofit2.http.Query

interface ListBreweriesApi {
    @GET("breweries")
    suspend fun get(@Query("by_city") city: String): List<Brewery>

    @GET("breweries")
    suspend fun getAll(): List<Brewery>
}
package com.brewery.training.api

import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Singleton
class BreweryRetrofit {

    private val retrofit by lazy {
        val logger = HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BASIC }

        val logClient = OkHttpClient.Builder()
            .addInterceptor(logger)
            .build()

        with(Retrofit.Builder()) {
            baseUrl(BASE_URL)
            client(logClient)
            addConverterFactory(GsonConverterFactory.create())
            build()
        }
    }

    fun <T> create(service: Class<out T>): T {
        return retrofit.create(service)
    }

    companion object {
        const val BASE_URL = "https://api.openbrewerydb.org/"
    }
}
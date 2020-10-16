package com.brewery.training.di

import com.brewery.training.api.BreweryRetrofit
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RetrofitModule {
    @Singleton
    @Provides
    fun providesBreweryRetrofit(): BreweryRetrofit {
        return BreweryRetrofit()
    }
}
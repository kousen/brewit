package com.brewery.training.di

import com.brewery.training.MainActivity
import com.brewery.training.api.BreweryRetrofit
import dagger.Module
import dagger.Provides
import dagger.android.ContributesAndroidInjector
import javax.inject.Singleton

@Module
interface AppModule {

    @ContributesAndroidInjector(modules = [MainActivityModule::class])
    fun contributeMainActivity(): MainActivity


}
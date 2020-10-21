package com.brewery.training.di

import com.brewery.training.view.BreweryListFragment
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
interface MainActivityModule {

    @ContributesAndroidInjector(modules = [BreweryListFragmentModule::class])
    fun contributesMainFragment() : BreweryListFragment
}
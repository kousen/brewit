package com.brewery.training.di

import com.brewery.training.data.BreweryRepository
import com.brewery.training.view.BreweryListFragment
import com.brewery.training.viewmodels.BreweryListViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class BreweryListFragmentModule {
    @Provides
    fun providesViewModelFactory(
        fragment: BreweryListFragment,
        breweryRepository: BreweryRepository
    ): BreweryListViewModelFactory {
        return BreweryListViewModelFactory(fragment, fragment.arguments, breweryRepository)
    }
}
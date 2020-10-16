package com.brewery.training.viewmodels

import android.os.Bundle
import androidx.annotation.NonNull
import androidx.annotation.Nullable
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.brewery.training.data.BreweryRepository
import javax.inject.Inject

class BreweryListViewModelFactory (
    owner: SavedStateRegistryOwner,
    defaultArgs : Bundle?,
    private val breweryRepository: BreweryRepository
) : AbstractSavedStateViewModelFactory(owner, defaultArgs) {

    override fun <T : ViewModel?> create(
        key: String,
        modelClass: Class<T>,
        handle: SavedStateHandle
    ): T {
       return BreweryListViewModel(handle, breweryRepository) as T
    }

}
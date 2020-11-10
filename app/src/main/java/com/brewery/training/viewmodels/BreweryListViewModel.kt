package com.brewery.training.viewmodels

import android.util.Log
import androidx.lifecycle.*
import com.brewery.training.data.Brewery
import com.brewery.training.data.BreweryRepository
import kotlinx.coroutines.launch
import javax.inject.Inject

class BreweryListViewModel @Inject constructor(
    private val savedStateHandle: SavedStateHandle,
    private val breweryRepository: BreweryRepository
) : ViewModel() {

    private val _listLiveData = MutableLiveData<List<Brewery>>()
    val listLiveData: LiveData<List<Brewery>>
        get() =
            getFilter().switchMap { filter ->
                refresh(filter)
                breweryRepository.get(if (filter.isNullOrBlank()) "%" else "%$filter%")
            }

    fun refresh(filter: String?) {
        Log.d(TAG, "calling refresh with filter $filter")
        viewModelScope.launch {
            if (filter.isNullOrBlank()) {
                _listLiveData.value = breweryRepository.refreshBreweryList()
            } else {
                val value = breweryRepository.refreshBreweryList(filter)
                _listLiveData.value = value
            }
        }
    }

    fun setCity(city: String) {
        savedStateHandle.set(FILTER_SAVED_STATE_KEY, city)
    }

    private fun getFilter() =
        savedStateHandle.getLiveData<String>(FILTER_SAVED_STATE_KEY)

    companion object {
        const val FILTER_SAVED_STATE_KEY = "BREWERY_FILTER_SAVED_STATE_KEY"
        val TAG = BreweryListViewModel::class.simpleName
    }
}
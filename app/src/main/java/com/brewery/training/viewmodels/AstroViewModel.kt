package com.brewery.training.viewmodels

import androidx.lifecycle.*
import kotlinx.coroutines.Dispatchers

class AstroViewModel : ViewModel() {

    private val _response = MutableLiveData<AstroResponse>()

    val response = liveData(viewModelScope.coroutineContext + Dispatchers.IO) {
        emit(getAstronauts())
    }
}

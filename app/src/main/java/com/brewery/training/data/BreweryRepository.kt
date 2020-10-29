package com.brewery.training.data

import androidx.lifecycle.LiveData
import com.brewery.training.api.BreweryRetrofit
import com.brewery.training.api.ListBreweriesApi
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject

class BreweryRepository @Inject constructor(
    private val breweryRetrofit: BreweryRetrofit,
    private val breweryDao: BreweryDao
) {

    suspend fun refreshBreweryList(): List<Brewery> = withContext(Dispatchers.IO) {
        val listBreweriesApi = breweryRetrofit.create(ListBreweriesApi::class.java)
        val list = listBreweriesApi.getAll()

        //update DAO
        breweryDao.insert(list)

        list
    }

    fun get(city: String): LiveData<List<Brewery>> {
        return breweryDao.get(city)
    }

    suspend fun refreshBreweryList(city: String): List<Brewery> =
        withContext(Dispatchers.IO) {
            val listBreweriesApi = breweryRetrofit.create(ListBreweriesApi::class.java)
            val list = listBreweriesApi.get(city)

            //update DAO
            breweryDao.insert(list)

            list
        }
}
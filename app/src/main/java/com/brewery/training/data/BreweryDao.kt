package com.brewery.training.data

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface BreweryDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(optInTreatment: List<Brewery>)

    @Query("select * from brewery where city like :city")
    fun get(city: String) : LiveData<List<Brewery>>
}
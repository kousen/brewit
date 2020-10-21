package com.brewery.training.di

import android.content.Context
import com.brewery.training.data.AppDatabase
import com.brewery.training.data.BreweryDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {
    @Singleton
    @Provides
    fun providesAppDatabase(context: Context): AppDatabase {
        return AppDatabase.getInstance(context)
    }

    @Singleton
    @Provides
    fun providesBreweryDao(appDatabase: AppDatabase): BreweryDao {
        return appDatabase.breweryDao()
    }

}
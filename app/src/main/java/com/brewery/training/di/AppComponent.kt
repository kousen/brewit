package com.brewery.training.di

import android.content.Context
import com.brewery.training.MainApp
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjectionModule
import dagger.android.AndroidInjector
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidInjectionModule::class,
        AppModule::class,
        RetrofitModule::class,
        DatabaseModule::class
    ]
)
interface AppComponent : AndroidInjector<MainApp> {


    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): AppComponent
    }


}
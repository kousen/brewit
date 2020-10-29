package com.brewery.training

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.brewery.training.view.BreweryListFragment
import com.brewery.training.viewmodels.BreweryListViewModel
import dagger.android.AndroidInjection
import dagger.android.AndroidInjector
import dagger.android.DispatchingAndroidInjector
import dagger.android.HasAndroidInjector
import javax.inject.Inject

class MainActivity : AppCompatActivity(), HasAndroidInjector {

    @Inject
    lateinit var dispatchingAndroidInjector: DispatchingAndroidInjector<Any>

    override fun onCreate(savedInstanceState: Bundle?) {

        AndroidInjection.inject(this)
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (savedInstanceState == null) {
            val fragment = BreweryListFragment().apply {
                arguments = Bundle().apply {
                    putString(BreweryListViewModel.FILTER_SAVED_STATE_KEY, "portland")
                }
            }
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment_container, fragment, MAIN_FRAGMENT_TAG).commit()
        }
    }

    override fun androidInjector(): AndroidInjector<Any> = dispatchingAndroidInjector

    companion object {
        const val MAIN_FRAGMENT_TAG = "MainFragment"
    }

}
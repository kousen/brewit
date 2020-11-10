package com.brewery.training.view

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import androidx.lifecycle.observe
import androidx.recyclerview.widget.LinearLayoutManager
import com.brewery.training.R
import com.brewery.training.databinding.BreweryListLayoutBinding
import com.brewery.training.viewmodels.BreweryListViewModel
import com.brewery.training.viewmodels.BreweryListViewModelFactory
import dagger.android.support.AndroidSupportInjection
import javax.inject.Inject

class BreweryListFragment : Fragment() {

    @Inject
    lateinit var adapter: BreweryListAdapter

    @Inject
    lateinit var viewModelFactory: BreweryListViewModelFactory

    private val viewModel: BreweryListViewModel by viewModels { viewModelFactory }

    lateinit var binding: BreweryListLayoutBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = BreweryListLayoutBinding.inflate(inflater, container, false)
        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        AndroidSupportInjection.inject(this)

        binding.recyclerView.adapter = adapter
        binding.recyclerView.layoutManager = LinearLayoutManager(view.context)

        viewModel.listLiveData.observe(viewLifecycleOwner) { list -> adapter.setItems(list) }
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        inflater.inflate(R.menu.menu_city_list, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem) = when (item.itemId) {
        R.id.portland -> {
            viewModel.setCity("portland")
            true
        }
        R.id.hartford -> {
            viewModel.setCity("hartford")
            true
        }
        else -> super.onOptionsItemSelected(item)
    }

}
package com.brewery.training.view

import androidx.recyclerview.widget.RecyclerView
import com.brewery.training.data.Brewery
import com.brewery.training.databinding.BreweryListItemLayoutBinding

class BreweryViewHolder(private val binding: BreweryListItemLayoutBinding) :
    RecyclerView.ViewHolder(binding.root) {
    fun bind(brewery: Brewery) {
        binding.content = brewery
        binding.executePendingBindings()
    }
}

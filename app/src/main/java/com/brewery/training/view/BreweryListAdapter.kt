package com.brewery.training.view

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.brewery.training.data.Brewery
import com.brewery.training.databinding.BreweryListItemLayoutBinding
import com.brewery.training.databinding.BreweryListLayoutBinding
import javax.inject.Inject

class BreweryListAdapter @Inject constructor() : RecyclerView.Adapter<BreweryViewHolder>() {

    private val items = mutableListOf<Brewery>()

    fun setItems(items: List<Brewery>) {
        this.items.clear()
        this.items.addAll(items)
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BreweryViewHolder {
        return BreweryViewHolder(
            BreweryListItemLayoutBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    override fun getItemCount(): Int = items.size

    override fun onBindViewHolder(holder: BreweryViewHolder, position: Int) {
        holder.bind(items[position])
    }

}
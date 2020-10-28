package com.brewery.training.view

import android.content.res.ColorStateList
import android.widget.ImageView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.brewery.training.R
import com.brewery.training.data.BreweryType
import java.util.*

@BindingAdapter(value = ["brewerBackground"])
fun brewerBackgroundBindingAdapter(imageView: ImageView, breweryTypeStr: String?) {

//    val breweryType = if (breweryTypeStr == null) null else BreweryType.valueOf(
//        breweryTypeStr.toUpperCase(Locale.US))

    // let is a scope function --> available on all Kotlin classes
    // short for saying, "let's do this block"
    val breweryType = breweryTypeStr?.let { string ->
        BreweryType.valueOf(string.toUpperCase(Locale.US))
    } ?: BreweryType.PROPRIETOR

    val color = when (breweryType) {
        BreweryType.MICRO -> R.color.brewery_type_micro
        BreweryType.REGIONAL -> R.color.brewery_type_regional
        BreweryType.BREWPUB -> R.color.brewery_type_brewpub
        BreweryType.LARGE -> R.color.brewery_type_large
        BreweryType.PLANNING -> R.color.brewery_type_planning
        BreweryType.BAR -> R.color.brewery_type_bar
        BreweryType.CONTRACT -> R.color.brewery_type_contract
        BreweryType.PROPRIETOR -> R.color.brewery_type_proprietor
    }
    imageView.imageTintList = ColorStateList.valueOf(
        ResourcesCompat.getColor(
            imageView.resources,
            color,
            imageView.context.theme
        )
    )
}
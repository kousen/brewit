package com.brewery.training.view

import android.content.res.ColorStateList
import android.graphics.BlendMode
import android.graphics.Color
import android.graphics.PorterDuff
import android.view.View
import android.widget.ImageView
import androidx.cardview.widget.CardView
import androidx.core.content.res.ResourcesCompat
import androidx.databinding.BindingAdapter
import com.brewery.training.R
import com.brewery.training.data.BreweryType
import java.util.*

@BindingAdapter(value = ["brewerBackground"])
fun brewerBackgroundBindingAdapter(imageView: ImageView, breweryTypeStr: String?) {

    val breweryType = if (breweryTypeStr == null) null else BreweryType.valueOf(
        breweryTypeStr.toUpperCase(Locale.US))

    val color = when (breweryType) {
        BreweryType.MICRO -> R.color.brewery_type_micro
        BreweryType.REGIONAL -> R.color.brewery_type_regional
        BreweryType.BREWPUB -> R.color.brewery_type_brewpub
        BreweryType.LARGE -> R.color.brewery_type_large
        BreweryType.PLANNING -> R.color.brewery_type_planning
        BreweryType.BAR -> R.color.brewery_type_bar
        BreweryType.CONTRACT -> R.color.brewery_type_contract
        BreweryType.PROPRIETOR -> R.color.brewery_type_proprietor
        else -> R.color.brewery_type_proprietor
    }
    imageView.imageTintList = ColorStateList.valueOf(ResourcesCompat.getColor(imageView.resources, color, imageView.context.theme))
}
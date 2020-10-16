package com.brewery.training.data

import androidx.room.Entity
import androidx.room.PrimaryKey


//id: 299,
//name: "Almanac Beer Company",
//brewery_type: "micro",
//street: "651B W Tower Ave",
//city: "Alameda",
//state: "California",
//postal_code: "94501-5047",
//country: "United States",
//longitude: "-122.306283180899",
//latitude: "37.7834497667258",
//phone: "4159326531",
//website_url: "http://almanacbeer.com",
//updated_at: "2018-08-23T23:24:11.758Z"
@Entity(tableName = "brewery")
data class Brewery(
    @PrimaryKey val id: String,
    val name: String,
    val brewery_type: String,
    val street: String,
    val city: String,
    val postal_code: String,
    val phone: String,
    val website_url: String
)
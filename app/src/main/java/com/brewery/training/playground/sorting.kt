package com.brewery.training.playground

import kotlinx.android.synthetic.main.activity_main.view.*
import kotlin.math.sqrt

data class Golfer(val score: Int, val first: String, val last: String)

val golfers = listOf(
    Golfer(70, "Jack", "Nicklaus"),
    Golfer(68, "Tom", "Watson"),
    Golfer(68, "Bubba", "Watson"),
    Golfer(70, "Tiger", "Woods"),
    Golfer(68, "Ty", "Webb")
)

fun main() {
    golfers.sortedWith(Comparator { g1, g2 -> g1.score - g2.score} )
        .also(::println)

    golfers.sortedWith(compareBy(Golfer::last)).also(::println)
    golfers.sortedWith(compareBy( { it.last }, { it.first}, { it.score })).also(::println)

    val x: Int = 3
    val y: Long = x.toLong()
    sqrt(25.toDouble())
}
package com.brewery.training.playground._3TaxiPark


import org.junit.Assert.assertEquals
import org.junit.Assert.assertTrue
import org.junit.Test

class _4TestSmartPassengers {
    @Test
    fun testSmartPassengers() {
        val park = taxiPark(1..2, 1..2, order(1, 1, discount = 0.1), order(2, 2))
        assertEquals(passengers(1).toSet(), park.findSmartPassengers())
    }

    @Test
    fun testMoreThenMajorityDiscountTrips() {
        val park = taxiPark(1..1, 1..1, order(1, 1, discount = 0.1), order(1, 1, discount = 0.2), order(1, 1))
        assertEquals(passengers(1).toSet(), park.findSmartPassengers())
    }

    @Test
    fun testLessThenMajorityDiscountTrips() {
        val park = taxiPark(1..1, 1..1, order(1, 1), order(1, 1), order(1, 1, discount = 0.2), order(1, 1))
        assertTrue(park.findSmartPassengers().isEmpty())
    }
}
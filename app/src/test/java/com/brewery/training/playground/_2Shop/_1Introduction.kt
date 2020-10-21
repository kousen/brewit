package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _1Introduction {
    @Test
    fun testSetOfCustomers() {
        assertEquals(customers.values.toSet(), shop.getSetOfCustomers())
    }
}

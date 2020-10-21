package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _8Zip {
    @Test
    fun testZipNameAndCustomer() {
        assertEquals(customers.toList(), shop.zipNameAndCustomer())
    }
}
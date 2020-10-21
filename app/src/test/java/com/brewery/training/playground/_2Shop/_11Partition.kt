package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _11Partition {
    @Test
    fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        assertEquals(setOf(customers[reka]), shop.getCustomersWithMoreUndeliveredOrdersThanDelivered())
    }
}

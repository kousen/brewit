package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _9AssociateBy {
    @Test
    fun testAssociateCustomersByName() {
        assertEquals(customers, shop.associateCustomersByName())
    }
}
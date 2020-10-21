package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _12Fold {
    @Test
    fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'") {
            customer(lucas, Canberra) {
                order(idea)
                order(webStorm)
            }
            customer(reka, Budapest) {
                order(idea)
                order(youTrack)
            }
        }
        assertEquals(setOf(idea), testShop.getSetOfProductsOrderedByEveryCustomer())
    }
}

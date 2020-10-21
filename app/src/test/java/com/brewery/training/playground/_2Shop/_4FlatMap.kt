package com.brewery.training.playground._2Shop

import org.junit.Assert.assertEquals
import org.junit.Test

class _4FlatMap {
    @Test
    fun testGetOrderedProductsSet() {
        assertEquals(setOf(idea), customers[reka]!!.orderedProducts)
    }

    @Test fun testGetAllOrderedProducts() {
        assertEquals(orderedProducts, shop.allOrderedProducts)
    }
}

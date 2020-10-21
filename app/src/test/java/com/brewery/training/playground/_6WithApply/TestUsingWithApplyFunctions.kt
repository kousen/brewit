package com.brewery.training.playground._6WithApply

import org.junit.Assert.assertEquals
import org.junit.Test

class TestUsingWithApplyFunctions {
    @Test
    fun testUsingWith() {
        val menuItem = initializeMenuItem1()
        val message = "Menu item should initialized (using 'with' function)"
        assertEquals("Belgian Waffles", menuItem.name, message)
        assertEquals(message, 5.95, menuItem.price)
        assertEquals(message, 650, menuItem.calories)
    }

    @Test
    fun testUsingApply() {
        val menuItem = initializeMenuItem2()
        val message = "Menu item should initialized (using 'apply' function)"
        assertEquals("Belgian Waffles", menuItem.name, message)
        assertEquals(message, 5.95, menuItem.price)
        assertEquals(message, 650, menuItem.calories)
    }
}
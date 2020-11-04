package com.brewery.training.playground

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertTrue
import org.junit.Test

class DemoTest {
    @Test
    fun `x should be an integer`() {
        assertTrue(5 is Int)
    }

    @Test
    fun `Hamcrest matcher is function`() {
        assertThat(5, `is`(2 + 3))
    }

    @Test
    fun yet_another_test() {

    }
}
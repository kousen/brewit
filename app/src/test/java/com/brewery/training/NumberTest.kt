package com.brewery.training

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Test

class NumberTest {
    @Test
    fun `check that a variable is a string`() {
        val s = "Hello"
        assertThat(s, `is`("Hello"))
    }

    @Test
    fun yet_another_test() {
        // TODO("Not yet implemented")
    }
}
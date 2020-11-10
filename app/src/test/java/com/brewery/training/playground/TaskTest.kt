package com.brewery.training.playground

import org.hamcrest.CoreMatchers.`is`
import org.hamcrest.MatcherAssert.assertThat
import org.junit.Assert.assertEquals
import org.junit.Test

class TaskTest {
    @Test
    fun `default priority should match constant in class`() {
        val task = Task("task 1")
        assertEquals(Task.DEFAULT_PRIORITY, task.priority)
    }

    @Test
    fun `set priority too large and it will be coerced into range`() {
        val task = Task("task 1")
        task.priority = 42  // set coerces value into the range MIN..MAX
        assertEquals(Task.MAX_PRIORITY, task.priority) // get the value
        assertThat(Task.MAX_PRIORITY, `is`(task.priority))
    }

    @Test
    fun test_of_other_info() {

    }
}
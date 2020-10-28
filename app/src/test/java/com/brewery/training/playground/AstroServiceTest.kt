package com.brewery.training.playground

import org.junit.Test

import org.junit.Assert.*

class AstroServiceTest {

    @Test
    fun `get the astronauts in space at the moment`() {
        val astroResponse = getAstroResponse()
        assertEquals("success", astroResponse.message)
        assertEquals(astroResponse.number, astroResponse.people.size)
    }
}
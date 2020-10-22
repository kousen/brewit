package com.brewery.training.viewmodels

import kotlinx.coroutines.runBlocking
import org.junit.Assert.*
import org.junit.Test

class AstroServiceTest {
    @Test
    fun `get response from open-notify`() {
        runBlocking {
            val astroResponse = getAstronauts()
            println("There are ${astroResponse.number} people in space")
            astroResponse.people.forEach {
                println("${it.name} aboard ${it.craft}")
            }

            assertEquals(astroResponse.number, astroResponse.people.size)
            assertEquals("success", astroResponse.message)
        }
    }
}
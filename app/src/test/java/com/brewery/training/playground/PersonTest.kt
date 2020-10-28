package com.brewery.training.playground

import org.junit.Assert.*
import org.junit.Test
import java.time.LocalDate
import java.time.Month

class PersonTest {
    @Test
    fun `check equivalent instances`() {
        val person1 = Person("Jean-Luc", LocalDate.of(2305, Month.JULY, 23))
        val person2 = Person("Jean-Luc", LocalDate.of(2305, Month.JULY, 23))
        assertEquals(person2, person1)
        assertNotSame(person1, person2)
    }

    @Test
    fun `use copy to make new instance with different name`() {
        val person = Person("Jean-Luc", LocalDate.of(2305, Month.JULY, 23))
        val copy = person.copy(name = "Another person with the same birthdate")
        assertEquals(person.dob, copy.dob)
        assertNotEquals(person.name, copy.name)
    }

    @Test
    fun `use componentN methods for destructuring`() {
        val person = Person("Jean-Luc", LocalDate.of(2305, Month.JULY, 23))
        val (_, birthday) = person
        println("birthday = $birthday")
    }
}
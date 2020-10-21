package com.brewery.training.playground.demo

import org.junit.Test

import org.junit.Assert.*

class HelloTest {

    @Test
    fun `check if strings are palindromes`() {
        assertTrue("Madam, in Eden, I'm Adam".isPalindrome())
        assertTrue("Flee to me, remote elf!".isPalindrome())
    }

    @Test
    fun `verify that the method doesn't just return true`() {
        assertFalse("This is not a palindrome".isPalindrome())
    }
}
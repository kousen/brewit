package com.brewery.training.playground

import org.junit.Test

import org.junit.Assert.*

class PalindromesTest {

    @Test
    fun testIsPalindrome() {
        assertTrue(isPalindrome("Madam, in Eden, I'm Adam"))
        assertTrue(isPalindrome("Go hang a salami, I'm a lasagna hog!"))
        assertTrue(isPalindrome(" "))
        assertTrue(isPalindrome(""))
    }

    @Test
    fun testIsNotPalindrome() {
        assertFalse(isPalindrome("This is not a palindrome"))
    }

    @Test
    fun testIsPalindromeAsExtension() {
        assertTrue("Madam, in Eden, I'm Adam".isPal())
        assertTrue("Go hang a salami, I'm a lasagna hog!".isPal())
        assertTrue(" ".isPal())
        assertTrue("".isPal())
    }
}
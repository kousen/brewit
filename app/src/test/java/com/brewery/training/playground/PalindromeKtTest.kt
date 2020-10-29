package com.brewery.training.playground

import org.junit.Assert.*
import org.junit.Test

class PalindromeKtTest {
    @Test
    fun `these should all be palindromes`() {
        isPalindrome("Madam, in Eden, I'm Adam")
        isPalindrome("racecar")
        isPalindrome("Flee to me, remote elf!")
        isPalindrome("A Santa pets rats, as Pat taps a star step at NASA")
    }

    @Test
    fun `this should NOT be a palindrome`() {
        isPalindrome("This is not a palindrome")
    }

    @Test
    fun `check palindromes using extension function`() {
        assertTrue("Madam, in Eden, I'm Adam".isPal())
    }
}
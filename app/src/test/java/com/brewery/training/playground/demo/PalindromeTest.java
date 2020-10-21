package com.brewery.training.playground.demo;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {
    @Test
    public void testIsPalindrome() {
        assertTrue(Utilities.isPalindrome("Flee to me, remote elf!"));
    }
}

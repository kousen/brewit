package com.brewery.training.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GreetingTest {
    @Test
    public void testGreeting() {
        assertEquals("Hello, World!", Utilities.getGreeting("World"));
        assertEquals("Hello, Dolly!", Utilities.getGreeting("Dolly"));
    }
}

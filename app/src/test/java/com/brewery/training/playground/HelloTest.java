package com.brewery.training.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HelloTest {
    @Test
    public void testGreetWithAName() {
        assertEquals("Hello, Dolly!", Utilities.greeting("Dolly"));
    }

    @Test
    public void testGreetWithoutAName() {
        assertEquals("Hello, World!", Utilities.greeting());
    }
}

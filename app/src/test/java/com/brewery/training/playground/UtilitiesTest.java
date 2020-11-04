package com.brewery.training.playground;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UtilitiesTest {
    @Test
    public void testSayHello() {
        String response = MainKt.sayHello("Dolly");
        assertEquals("Hello, Dolly!", response);
    }
}

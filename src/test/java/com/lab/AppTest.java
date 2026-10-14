package com.lab;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {

    @Test
    public void testFirstFiveNumbers() {
        assertArrayEquals(
            new int[]{0, 1, 1, 2, 3},
            App.fibonacci(5)
        );
    }

    @Test
    public void testZeroCount() {
        assertArrayEquals(new int[]{}, App.fibonacci(0));
    }

    @Test
    public void testOneNumber() {
        assertArrayEquals(new int[]{0}, App.fibonacci(1));
    }

    @Test(expected = IllegalArgumentException.class)
    public void testNegativeCount() {
        App.fibonacci(-1);
    }
}
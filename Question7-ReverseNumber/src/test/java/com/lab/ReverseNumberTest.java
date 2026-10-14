package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class ReverseNumberTest {
    @Test
    void reversePositive() { assertEquals(4321, new ReverseNumber().reverse(1234)); }

    @Test
    void reverseWithTrailingZero() { assertEquals(21, new ReverseNumber().reverse(1200)); }

    @Test
    void reverseNegative() { assertEquals(-321, new ReverseNumber().reverse(-123)); }

    @Test
    void reverseZero() { assertEquals(0, new ReverseNumber().reverse(0)); }
}
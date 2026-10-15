
package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

public class SimpleInterestTest {

    // Positive test cases

    @Test
    void testSimpleInterest() {
        assertEquals(100.0,
                new SimpleInterest().calculate(1000, 5, 2), 0.001);
    }

    @Test
    void testZeroRate() {
        assertEquals(0.0,
                new SimpleInterest().calculate(1000, 0, 2), 0.001);
    }

    @Test
    void testZeroTime() {
        assertEquals(0.0,
                new SimpleInterest().calculate(1000, 5, 0), 0.001);
    }

    @Test
    void testZeroPrincipal() {
        assertEquals(0.0,
                new SimpleInterest().calculate(0, 5, 2), 0.001);
    }

    // Failure test cases

    @Test
    void testNegativePrincipal() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimpleInterest().calculate(-1000, 5, 2));
    }

    @Test
    void testNegativeRate() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimpleInterest().calculate(1000, -5, 2));
    }

    @Test
    void testNegativeTime() {
        assertThrows(IllegalArgumentException.class,
                () -> new SimpleInterest().calculate(1000, 5, -2));
    }
}

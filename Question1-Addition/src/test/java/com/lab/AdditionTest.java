
package com.lab;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AdditionTest {

    @Test
    void testAddition() {
        Addition obj = new Addition();
        assertEquals(30, obj.add(10, 20));
    }

    @Test
    void testNegativeNumbers() {
        Addition obj = new Addition();
        assertEquals(-5, obj.add(-2, -3));
    }

    @Test
    void testAddingZero() {
        Addition obj = new Addition();
        assertEquals(5, obj.add(5, 0));
    }
}

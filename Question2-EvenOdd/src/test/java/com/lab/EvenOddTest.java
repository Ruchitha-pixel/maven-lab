
package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EvenOddTest {

    @Test
    void testEvenNumber() {
        EvenOdd obj = new EvenOdd();
        assertTrue(obj.isEven(8));
    }

    @Test
    void testOddNumber() {
        EvenOdd obj = new EvenOdd();
        assertFalse(obj.isEven(7));
    }

    @Test
    void testZeroIsEven() {
        EvenOdd obj = new EvenOdd();
        assertTrue(obj.isEven(0));
    }

    @Test
    void testNegativeEvenNumber() {
        EvenOdd obj = new EvenOdd();
        assertTrue(obj.isEven(-4));
    }
}

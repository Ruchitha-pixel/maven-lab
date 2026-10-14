package com.lab;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class PrimeNumberTest {
    @Test
    void primeNumber() { assertTrue(new PrimeNumber().isPrime(17)); }

    @Test
    void compositeNumber() { assertFalse(new PrimeNumber().isPrime(12)); }

    @Test
    void zeroIsNotPrime() { assertFalse(new PrimeNumber().isPrime(0)); }

    @Test
    void oneIsNotPrime() { assertFalse(new PrimeNumber().isPrime(1)); }

    @Test
    void twoIsPrime() { assertTrue(new PrimeNumber().isPrime(2)); }
}
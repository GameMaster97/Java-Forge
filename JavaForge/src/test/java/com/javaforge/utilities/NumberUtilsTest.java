package com.javaforge.utilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumberUtilsTest {
    @Test void identifiesPrimes() {
        assertTrue(NumberUtils.isPrime(2));
        assertTrue(NumberUtils.isPrime(97));
    }
    @Test void rejectsNonPrimes() {
        assertFalse(NumberUtils.isPrime(-7));
        assertFalse(NumberUtils.isPrime(0));
        assertFalse(NumberUtils.isPrime(1));
        assertFalse(NumberUtils.isPrime(100));
    }
}

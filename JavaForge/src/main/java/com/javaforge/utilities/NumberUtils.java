package com.javaforge.utilities;

/** Common numeric operations. */
public final class NumberUtils {
    private NumberUtils() {}

    /** Returns true if n is a prime number. */
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;
        if (n % 2 == 0) return false;
        for (int divisor = 3; divisor <= n / divisor; divisor += 2) {
            if (n % divisor == 0) return false;
        }
        return true;
    }
}

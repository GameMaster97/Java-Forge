package com.javaforge.utilities;

/** Common string operations used throughout JavaForge. */
public final class StringUtils {
    private StringUtils() {}

    /** Reverses a string by Unicode code point. Returns null when input is null. */
    public static String reverse(String input) {
        if (input == null) return null;
        int[] points = input.codePoints().toArray();
        StringBuilder result = new StringBuilder(input.length());
        for (int i = points.length - 1; i >= 0; i--) result.appendCodePoint(points[i]);
        return result.toString();
    }

    /** Checks palindrome status, ignoring case and non-letter/digit characters. */
    public static boolean isPalindrome(String input) {
        if (input == null) return false;
        int[] points = input.codePoints()
                .filter(Character::isLetterOrDigit)
                .map(Character::toLowerCase)
                .toArray();
        for (int left = 0, right = points.length - 1; left < right; left++, right--) {
            if (points[left] != points[right]) return false;
        }
        return true;
    }
}

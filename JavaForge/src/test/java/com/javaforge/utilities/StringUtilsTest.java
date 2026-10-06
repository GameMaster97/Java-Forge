package com.javaforge.utilities;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {
    @Test void reversesString() { assertEquals("olleh", StringUtils.reverse("hello")); }
    @Test void reverseHandlesNull() { assertNull(StringUtils.reverse(null)); }
    @Test void recognizesPalindromeIgnoringPunctuation() {
        assertTrue(StringUtils.isPalindrome("A man, a plan, a canal: Panama!"));
    }
    @Test void rejectsNonPalindrome() { assertFalse(StringUtils.isPalindrome("Java")); }
    @Test void emptyStringIsPalindrome() { assertTrue(StringUtils.isPalindrome("")); }
}

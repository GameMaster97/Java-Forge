package com.javaforge.algorithms;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {
    @Test void findsTarget() { assertEquals(2, ArrayUtils.binarySearch(new int[]{1, 3, 5, 7}, 5)); }
    @Test void returnsMinusOneWhenMissing() { assertEquals(-1, ArrayUtils.binarySearch(new int[]{1, 3, 5}, 4)); }
    @Test void handlesEmptyArray() { assertEquals(-1, ArrayUtils.binarySearch(new int[]{}, 4)); }
    @Test void rejectsNullArray() { assertThrows(IllegalArgumentException.class, () -> ArrayUtils.binarySearch(null, 2)); }

    @Test void linearSearchFindsTarget() {
    assertEquals(2, ArrayUtils.linearSearch(new int[]{1, 3, 5, 7}, 5));
    }

    @Test void linearSearchFindsFirstDuplicate() {
        assertEquals(1, ArrayUtils.linearSearch(new int[]{4, 7, 7, 9}, 7));
    }

    @Test void linearSearchReturnsMinusOneWhenMissing() {
        assertEquals(-1, ArrayUtils.linearSearch(new int[]{1, 3, 5}, 4));
    }

    @Test void linearSearchHandlesEmptyArray() {
        assertEquals(-1, ArrayUtils.linearSearch(new int[]{}, 4));
    }

    @Test void linearSearchRejectsNullArray() {
        assertThrows(IllegalArgumentException.class, () -> ArrayUtils.linearSearch(null, 2));
    }
}

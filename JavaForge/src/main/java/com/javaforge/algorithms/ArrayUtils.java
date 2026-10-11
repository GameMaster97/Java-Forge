package com.javaforge.algorithms;

/** Algorithms for primitive arrays. */
public final class ArrayUtils {
    private ArrayUtils() {}

    /**
     * Searches a sorted array for target using binary search.
     * Returns an index of a match, or -1 if not found.
     * The input must be sorted in ascending order.
     */
    public static int binarySearch(int[] sorted, int target) {
        if (sorted == null) throw new IllegalArgumentException("Array must not be null");
        int low = 0, high = sorted.length - 1;
        while (low <= high) {
            int mid = low + (high - low) / 2;
            if (sorted[mid] == target) return mid;
            if (sorted[mid] < target) low = mid + 1;
            else high = mid - 1;
        }
        return -1;
    }
    /**
     * Searches an array for target using linear search.
     * Returns the index of the first match, or -1 if not found.
     *
     * @param values the array to search (must not be null)
     * @param target the value to find
     * @return the first matching index, or -1 if absent
     * @throws IllegalArgumentException if values is null
     */
    public static int linearSearch(int[] values, int target) {
        if (values == null) {
            throw new IllegalArgumentException("Array must not be null");
        }
        for (int i = 0; i < values.length; i++) {
            if (values[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

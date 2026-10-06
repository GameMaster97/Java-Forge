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
}

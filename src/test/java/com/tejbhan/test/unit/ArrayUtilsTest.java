package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

class ArrayUtilsTest {

    private final ArrayUtils arrayUtils = new ArrayUtils();

    @Test
    void testReverseArray() {
        int[] originalArray = {1, 2, 3, 4, 5};
        int[] expectedReversedArray = {5, 4, 3, 2, 1};
        int[] reversedArray = arrayUtils.reverseArray(originalArray);
        assertArrayEquals(expectedReversedArray, reversedArray, "Reversed array should match the expected reversed array");
    }

    @Test
    void testSortArray() {
        int[] originalArray = {5, 2, 8, 1, 6};
        int[] sortedArray = arrayUtils.sortArray(originalArray);

        assertNotEquals(Arrays.toString(originalArray), Arrays.toString(sortedArray),
                "Sorted array should not be equal to the original array");
    }



}

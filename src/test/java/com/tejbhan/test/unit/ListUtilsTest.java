package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

class ListUtilsTest {

    private final ListUtils listUtils = new ListUtils();

    @Test
    void testGetEvenNumbers() {
        int limit = 10;
        List<Integer> expectedEvenNumbers = List.of(2, 4, 6, 8, 10);
        List<Integer> actualEvenNumbers = listUtils.getEvenNumbers(limit);

        assertIterableEquals(expectedEvenNumbers, actualEvenNumbers,
                "List of even numbers should match expected list");
    }
}

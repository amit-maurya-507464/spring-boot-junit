package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;

class MathUtilsTest {

    @Test
    void testMathOperations() {
        assertAll("Math operations",
            () -> assertEquals(4, MathUtils.add(2, 2)),
            () -> assertEquals(0, MathUtils.subtract(2, 2)),
            () -> assertEquals(6, MathUtils.multiply(2, 3)),
            () -> assertEquals(3, MathUtils.divide(6, 2))
        );
    }
}

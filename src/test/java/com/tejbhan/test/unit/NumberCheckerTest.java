package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class NumberCheckerTest {

    private final NumberChecker numberChecker = new NumberChecker();

    @Test
    void testIsPositiveWithPositiveNumber() {
        int number = 5;
        assertTrue(numberChecker.isPositive(number), "The number should be positive");
    }

    @Test
    void testIsPositiveWithNegativeNumber() {
        int number = -5;
        assertFalse(numberChecker.isPositive(number), "The number should not be positive");
    }
}

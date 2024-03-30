package com.tejbhan.test.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        Assertions.assertEquals(4, calculator.add(2,2), "Addition method should return correct sum");
    }

    @Test
    void testNegativeAddition() {
        Assertions.assertNotEquals(5, calculator.add(2,2), "Addition method should not return correct sum");
    }

    @ParameterizedTest
    @CsvSource(
            {
                    "1,2,3",
                    "4,-2,2",
                    "10,99,109",
                    "-3,-5,-8"
            }
    )
    void testAddition(int a, int b, int result) {
        Assertions.assertEquals(result, calculator.add(a, b), "Addition method should return correct sum");
    }

    @Test
    void testDivideByZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
    }

    @Test
    void testDivideByNonZero() {
        Assertions.assertDoesNotThrow(() -> {
            calculator.divide(10, 2);
        });
    }

}

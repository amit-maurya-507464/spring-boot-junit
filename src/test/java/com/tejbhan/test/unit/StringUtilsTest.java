package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;

class StringUtilsTest {

    private final StringUtils stringUtils = new StringUtils();

    @Test
    void testReverseStringWithNullInput() {
        String reversedString = stringUtils.reverseString(null);
        assertNull(reversedString, "Reverse string of null should be null");
    }

    @Test
    void testReverseStringWithNotNullInput() {
        String reversedString = stringUtils.reverseString("Amit");
        assertNotNull(reversedString, "Reverse string of not null should be not null");
    }

}

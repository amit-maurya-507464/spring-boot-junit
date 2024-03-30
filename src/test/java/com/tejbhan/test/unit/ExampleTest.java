package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {

    @Test
    void testObjectInstance() {
        // Create an object to test
        Object obj = "Hello";

        // Assert that the object is an instance of String class
        assertInstanceOf(String.class, obj);
    }
}

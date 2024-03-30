package com.tejbhan.test.unit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertNotSame;
import static org.junit.jupiter.api.Assertions.assertSame;

class PersonTest {

    @Test
    void testSameInstance() {
        Person person1 = new Person("Alice");
        Person person2 = person1; // Reference to the same object as person1

        assertSame(person1, person2, "person1 and person2 should refer to the same instance");
    }

    @Test
    void testDifferentInstances() {
        Person person1 = new Person("Alice");
        Person person2 = new Person("Bob");

        assertNotSame(person1, person2, "person1 and person2 should not refer to the same instance");
    }
}

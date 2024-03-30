package com.tejbhan.test.unit;

public class StringUtils {

    public String reverseString(String input) {
        if (input == null) {
            return null;
        }
        return new StringBuilder(input).reverse().toString();
    }

}

package com.tejbhan.test.unit;

import java.util.ArrayList;
import java.util.List;

public class ListUtils {

    public List<Integer> getEvenNumbers(int limit) {
        List<Integer> evenNumbers = new ArrayList<>();
        for (int i = 2; i <= limit; i += 2) {
            evenNumbers.add(i);
        }
        return evenNumbers;
    }
}

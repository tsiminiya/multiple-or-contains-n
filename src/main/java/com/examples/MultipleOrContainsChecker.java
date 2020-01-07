package com.examples;

public class MultipleOrContainsChecker {

    private final int number;
    private final String numberString;

    public MultipleOrContainsChecker(int number) {
        this.number = number;
        numberString = String.valueOf(number);
    }

    public boolean isMultipleOrContains(int value) {
        if (value % number == 0)
            return true;
        String valueString = String.valueOf(value);
        if (valueString.contains(numberString))
            return true;
        return false;
    }

}

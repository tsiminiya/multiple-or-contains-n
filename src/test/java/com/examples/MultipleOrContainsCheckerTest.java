package com.examples;

import org.junit.Assert;
import org.junit.Test;

public class MultipleOrContainsCheckerTest {

    @Test
    public void testShouldReturnTrueWhenValueIsMultipleOfN() {
        MultipleOrContainsChecker multipleOrContainsChecker = new MultipleOrContainsChecker(5);
        Assert.assertTrue(multipleOrContainsChecker.isMultipleOrContains(20));
    }

    @Test
    public void testShouldReturnFalseWhenValueIsNotMultipleOfN() {
        MultipleOrContainsChecker multipleOrContainsChecker = new MultipleOrContainsChecker(5);
        Assert.assertFalse(multipleOrContainsChecker.isMultipleOrContains(26));
    }

    @Test
    public void testShouldReturnTrueWhenValueContainsN() {
        MultipleOrContainsChecker multipleOrContainsChecker = new MultipleOrContainsChecker(4);
        Assert.assertTrue(multipleOrContainsChecker.isMultipleOrContains(34));
    }

}

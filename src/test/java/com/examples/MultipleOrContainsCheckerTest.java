package com.examples;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MultipleOrContainsCheckerTest {

    private MultipleOrContainsChecker multipleOrContainsChecker;

    @Before
    public void beforeEach() {
        multipleOrContainsChecker = new MultipleOrContainsChecker(5);
    }

    @Test
    public void testShouldReturnTrueWhenValueIsMultipleOfN() {
        Assert.assertTrue(multipleOrContainsChecker.isMultipleOrContains(20));
    }

    @Test
    public void testShouldReturnFalseWhenValueIsNotMultipleOfN() {
        Assert.assertFalse(multipleOrContainsChecker.isMultipleOrContains(26));
    }

    @Test
    public void testShouldReturnTrueWhenValueContainsN() {
        MultipleOrContainsChecker multipleOrContainsChecker = new MultipleOrContainsChecker(4);
        Assert.assertTrue(multipleOrContainsChecker.isMultipleOrContains(34));
    }

    @After
    public void afterEach() {
        System.out.println("Test Finished!");
    }

}

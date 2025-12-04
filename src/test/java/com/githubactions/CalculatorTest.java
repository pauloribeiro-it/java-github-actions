package com.githubactions;

import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {

    @Test
    public void sum_two_numbers_test(){
        int total = new Calculator().sum(1,2);
        Assert.assertEquals(5, total);
    }
}

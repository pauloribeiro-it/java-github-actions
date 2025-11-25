package com.githubactions;

import java.util.Arrays;

public class Calculator {
    public Integer sum(int... numbers){
        return Arrays.stream(numbers).sum();
    }
}

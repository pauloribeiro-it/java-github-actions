package com.githubactions;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("15 + 10 + 5 = "+calculator.sum(15,10,5));
    }
}

package com.example;

public class Calculator {
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int subtract(int a, int b) {
        return a - b;
    }
    
    public int multiply(int a, int b) {
        return a * b;
    }
    
    public double divide(int a, int b) {
        // This will trigger a code smell in SonarCloud
        if (b == 0) {
            return 0; // Should throw exception instead
        }
        return (double) a / b;
    }
}
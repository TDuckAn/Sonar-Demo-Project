package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    
    private Calculator calculator = new Calculator();
    
    @Test
    public void testAdd() {
        assertEquals(8, calculator.add(5, 3));
    }
    
    @Test
    public void testSubtract() {
        assertEquals(6, calculator.subtract(10, 4));
    }
    
    @Test
    public void testMultiply() {
        assertEquals(15, calculator.multiply(3, 5));
    }
    
    @Test
    public void testDivide() {
        assertEquals(2.5, calculator.divide(5, 2), 0.001);
    }
}
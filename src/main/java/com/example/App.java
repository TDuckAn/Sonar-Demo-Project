package com.example;

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Calculator calc = new Calculator();
        System.out.println("5 + 3 = " + calc.add(5, 3));
        System.out.println("10 - 4 = " + calc.subtract(10, 4));
    }
}
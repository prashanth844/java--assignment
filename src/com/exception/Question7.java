package com.exception;

public class Question7 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;  // This will cause ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        } finally {
            System.out.println("This is the finally block. It always runs.");
        }
    }
    }

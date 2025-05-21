package com.exception;

public class Question5 {
    public static void main(String[] args) {
        try {
            throw new Exception("This is my custom exception message!");
        } catch (Exception e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }
    }
}

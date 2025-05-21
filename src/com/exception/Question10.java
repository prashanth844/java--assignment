package com.exception;

public class Question10 {
    public static void main(String[] args) {
        try {
            Class.forName("com.example.NonExistentClass");
        } catch (ClassNotFoundException e) {
            System.out.println("ClassNotFoundException caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

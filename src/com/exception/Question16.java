package com.exception;

public class Question16 {
    public static void main(String[] args) {
        String invalidNumber = "abc123";
        int num = Integer.parseInt(invalidNumber);
        System.out.println("Number: " + num);
    }
}

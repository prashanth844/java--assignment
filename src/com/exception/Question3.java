package com.exception;

public class Question3 {
    public static void riskyMethod() throws Exception {
        throw new Exception("Something went wrong!");
    }
    public static void main(String[] args) throws Exception {
        riskyMethod();
        System.out.println("This line won't execute if exception is thrown.");
    }
}

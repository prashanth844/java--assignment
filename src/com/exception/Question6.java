package com.exception;
class MyException extends Exception {
    public MyException(String message) {
        super(message);
    }
}
public class Question6 {
    public static void main(String[] args) {
        try {
            throw new MyException("This is my own exception!");
        } catch (MyException e) {
            System.out.println("Caught: " + e.getMessage());
        }
    }
}

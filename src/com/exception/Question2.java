package com.exception;

public class Question2 {
    public static void main(String[] args) {
        int a=0;
        int b=10;
        try {
          int c=b/a;
            System.out.println(c);
        }catch (ArithmeticException e){
            e.printStackTrace();
        }
        finally {
            System.out.println("arithmetic exception");
        }
    }
}

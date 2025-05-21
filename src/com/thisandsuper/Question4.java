package com.thisandsuper;

public class Question4 {
    Question4() {
        this(100);
        System.out.println("No-arg constructor");
    }

    Question4(int x) {
        System.out.println("Argument constructor: " + x);
    }

    public static void main(String[] args) {
        new Question4();
    }
}


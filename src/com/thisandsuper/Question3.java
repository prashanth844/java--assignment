package com.thisandsuper;

public class Question3 {
    Question3 () {
        this(10);
        System.out.println("No-arg constructor");
    }

    Question3 (int x) {
        System.out.println("Parameterized constructor: " + x);
    }

    public static void main(String[] args) {
        new Question3 ();
    }
}


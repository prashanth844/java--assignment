package com.strings;

public class Question6 {
    public static void main(String[] args) {
        String str = "abc123";
        boolean isMatch = str.matches("[a-z0-9]+");
        if (isMatch) {
            System.out.println("String matches the pattern.");
        } else {
            System.out.println("String does not match the pattern.");
        }
    }
}

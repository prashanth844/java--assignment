package com.strings;

public class Question4 {
    public static void main(String[] args) {
        String text = "HelloWorld";
        String sub = text.substring(5);
        String sub2 = text.substring(0, 5);

        System.out.println("Substring from index 5: " + sub);
        System.out.println("Substring from 0 to 5: " + sub2);
    }
}

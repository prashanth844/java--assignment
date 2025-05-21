package com.strings;

public class Question8 {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";
        String str3 = "HelloWorld";

        System.out.println("equalsIgnoreCase(): " + str1.equalsIgnoreCase(str2));
        System.out.println("startsWith(): " + str3.startsWith("Hello"));
        System.out.println("endsWith(): " + str3.endsWith("World"));
        System.out.println("compareTo(): " + str1.compareTo(str2));
    }
}

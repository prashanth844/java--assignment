package com.exception;

import java.lang.reflect.Method;

public class Question14 {
    public static void main(String[] args) {
        try {
            Class<?> clazz = String.class;
            Method method = clazz.getDeclaredMethod("noMethod");

        } catch (NoSuchMethodException e) {
            System.out.println("NoSuchMethodException caught: " + e.getMessage());
        }
    }
}

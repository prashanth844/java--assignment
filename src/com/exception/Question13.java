package com.exception;

import java.lang.reflect.Field;

public class Question13 {
    public static void main(String[] args) {
        try {
            Field field = String.class.getDeclaredField("noField");
        } catch (NoSuchFieldException e) {
            System.out.println("NoSuchFieldException caught: " + e.getMessage());
        }
    }
}

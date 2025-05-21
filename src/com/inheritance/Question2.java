package com.inheritance;

import com.modifiers.Sample2;

public class Question2 extends Sample2 {
    public  void accessFromSubclass() {
        System.out.println("Accessing number in subclass: " + number);
        showMessage();
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.accessFromSubclass();
    }
}

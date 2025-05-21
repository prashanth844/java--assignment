package com.constructor;

public class Question5 {
    public Question5() {
        System.out.println("Constructor called");
    }

    public void show() {
        System.out.println("Regular method called");
    }

    public static void main(String[] args) {
        Question5 obj = new Question5(); // ✅ Constructor called once during object creation

        obj.show(); // ✅ You can call methods multiple times
        obj.show();
    }
}
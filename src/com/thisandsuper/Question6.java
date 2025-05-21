package com.thisandsuper;
class Parent {
    void show() {
        System.out.println("Parent show()");
    }
}
public class Question6 extends Parent{
    void show() {
        System.out.println("Child show()");
    }
    void display() {
        this.show();
        super.show();
    }
    public static void main(String[] args) {
        Question6 c = new Question6();
        c.display();
    }
}

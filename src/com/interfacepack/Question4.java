package com.interfacepack;

public class Question4 implements Fourth,Five{
    @Override
    public void display() {
        System.out.println("display method");
    }

    @Override
    public void parent() {
        System.out.println("parent method");
    }

    public static void main(String[] args) {
        Question4 q=new Question4();
        q.display();
        q.parent();
    }
}

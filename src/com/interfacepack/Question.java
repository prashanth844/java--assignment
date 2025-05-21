package com.interfacepack;

public class Question implements First{
    @Override
    public void display() {
        System.out.println("implemented method");
    }

    public static void main(String[] args) {
        Question q=new Question();
        q.display();
    }
}

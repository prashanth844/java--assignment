package com.abstractpack;

abstract class First{
    public void display(){
        System.out.println("non abstract method");
    }
    abstract void sample();
}
public class Question4 extends First {
    public static void main(String[] args) {
        Question4 q=new Question4();
        q.display();

    }

    @Override
    void sample() {
        System.out.println("abstract method");
    }
}

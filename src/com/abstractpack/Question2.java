package com.abstractpack;
abstract class ParentSample {
    void display() {
        System.out.println("non abstract method");
    }
    abstract void sample();
}
public class Question2 extends ParentSample{
    public static void main(String[] args) {
        ParentSample p=new Question2();
        p.display();
        p.sample();
    }

    @Override
    void sample() {
        System.out.println("abstract method");
    }
}

package com.interfacepack;

public class Question3 implements Third{
    @Override
    public void print() {
        System.out.println("print method");
    }

    @Override
    public void hello() {
        System.out.println("hello method");
    }

    public static void main(String[] args) {
        Third t=new Question3();
        t.hello();
        t.print();
    }
}

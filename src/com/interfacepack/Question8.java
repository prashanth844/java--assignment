package com.interfacepack;

public class Question8 implements Eleven{
    @Override
    public void print() {
        System.out.println("print method from eleven interface");
    }

    public static void main(String[] args) {
        Question8 q=new Question8();
        System.out.println(Eleven.age);
        System.out.println(Eleven.name);
        q.print();
    }
}

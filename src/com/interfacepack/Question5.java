package com.interfacepack;

public class Question5 implements Six,Seven{
    @Override
    public void print() {
        System.out.println("print method in two different interfaces");
    }

    public static void main(String[] args) {
        Question5 q=new Question5();
        q.print();
    }
}

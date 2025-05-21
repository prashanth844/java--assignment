package com.interfacepack;

public class Question7 implements Ten{
    @Override
    public void show() {
        System.out.println("method from interface nine");
    }

    @Override
    public void hello() {
        System.out.println("method from ten interface");
    }

    public static void main(String[] args) {
        Question7 q=new Question7();
        q.hello();
        q.show();
    }
}

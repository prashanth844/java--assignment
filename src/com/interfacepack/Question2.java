package com.interfacepack;

public  class Question2 extends PartialImpl{
    @Override
    public void methodTwo() {
        System.out.println("Method Two implemented in subclass.");
    }

    public static void main(String[] args) {
        Question2 obj = new Question2();
        obj.methodOne();
    }
}
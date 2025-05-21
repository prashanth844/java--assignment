package com.staticpack;

public class Question5 {
    public static void print(){
        System.out.println("this is static method");
    }
    public void callStatic(){
        print();
    }
    public static void main(String[] args) {
        Question5 q=new Question5();
        q.callStatic();
    }
}

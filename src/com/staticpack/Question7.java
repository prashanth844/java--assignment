package com.staticpack;

public class Question7 {
    public static void print(){
        System.out.println("printing static method");
    }
    public void sample(){
        System.out.println("printing instance method");
    }

    public static void main(String[] args) {
        Question7 q=new Question7();
        print();
        q.sample();
    }
}

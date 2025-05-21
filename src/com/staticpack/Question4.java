package com.staticpack;

public class Question4 {
    public void print(){
        System.out.println("hello");
    }
    public static void sample(){
        Question4 q= new Question4();
        q.print();
    }

    public static void main(String[] args) {
        sample();
    }
}

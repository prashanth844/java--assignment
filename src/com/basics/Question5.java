package com.basics;

public class Question5 {
    int a=10;
    public void sample(){
        int a=5;
        System.out.println(a);
    }
    public static void main(String[] args) {
        Question5 q=new Question5();
        System.out.println(q.a);
        q.sample();
    }
}

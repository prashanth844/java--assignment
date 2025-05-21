package com.overload;

public class Question1 {
    public int add (int a,int b){
        return a+b;
    }
    public int add(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        Question1 q=new Question1();
        System.out.println(q.add(5,10));
        System.out.println(q.add(5,10,15));
    }
}

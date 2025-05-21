package com.staticpack;

public class Question3 {
    public static String name="jhon";
    public void print(){
        System.out.println("static variable:"+" "+name);
    }
    public static void main(String[] args) {
        Question3 q=new Question3();
        q.print();
    }
}

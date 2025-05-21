package com.constructor;

public class Question1 {
    int age;
    String name;
    public Question1() {
        System.out.println("Default constructor called");
    }
    public Question1(int age){
        this.age=age;
        System.out.println("one argument constructer:"+age);
    }
    public Question1(int age,String name){
        this.age=age;
        this.name=name;
        System.out.println("two argument constructer:"+age+" "+name);
    }

    public static void main(String[] args) {
        Question1 Q1=new Question1();
        Question1 Q2=new Question1(20);
        Question1 Q3=new Question1(20,"jhon");
    }
}

package com.constructor;
class MyClass{
    int age;
    String name;

    public MyClass(){
        System.out.println("parent class default constructor");
    }
    public MyClass(int age){
        this.age=age;
        System.out.println("parent class argument constructor");
    }
}
public class Question2 extends MyClass {
    String name;
    public Question2(String name){
        super();
        this.name=name;
        System.out.println("child class constructor");
    }
    public Question2(int age) {
        super(age);
        System.out.println("Child class constructor with age: " + age);
    }

    public static void main(String[] args) {
        Question2 q = new Question2("jhon");
        Question2 q1=new Question2(21);
    }
}

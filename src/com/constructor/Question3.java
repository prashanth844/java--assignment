package com.constructor;

public class Question3 {
    Question3(){
        System.out.println("this is default constructor");
    }
    public Question3(int age){
        System.out.println("public access specifier constructor"+" "+age);
    }
    private Question3(String name){
        System.out.println("private access specifier constructor"+" "+name);
    }
protected Question3(double val){
    System.out.println("protected access specifier"+" "+val);
}
    public static void main(String[] args) {
        Question3 q1=new Question3();
        Question3 q2=new Question3(21);
        Question3 q3=new Question3("jack");
        Question3 q4=new Question3(21.5);
    }
}

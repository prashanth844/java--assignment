package com.overload;

public class Question2 {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b,double c){
        return a+b+c;
    }
    public static void main(String[] args) {
        Question2 q=new Question2();
        System.out.println(q.add(2,3));
        System.out.println(q.add(4,5,6));
    }
}

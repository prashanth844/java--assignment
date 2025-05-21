package com.overload;

public class Question3 {
    public int add(int a,int b){
        return a+b;
    }
    public double add(double a,double b){
        return a+b;
    }

    public static void main(String[] args) {
        Question3 q=new Question3();
        System.out.println(q.add(1,2));
        System.out.println(q.add(1.2,4.3));
    }
}

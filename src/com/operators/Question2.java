package com.operators;

public class Question2 {
    public static void print(int a,int b){
        System.out.println(a++);
        System.out.println(a--);
        System.out.println(b++);
        System.out.println(b--);
    }
    public static void main(String[] args) {
        print(5,6);
    }
}

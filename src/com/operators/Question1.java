package com.operators;

public class Question1 {
    public static void arithmaticOpeartions(int a,int b){
        System.out.println("addition"+" "+(a+b));
        System.out.println("subtraction"+" "+(a-b));
        System.out.println("multiplication"+" "+(a*b));
        if(b!=0){
            System.out.println("division"+" "+(a/b));
        }else {
            System.out.println("cant divide");
        }
    }
    public static void main(String[] args) {
        int a=10;
        int b=5;
        arithmaticOpeartions(a,b);
    }
}

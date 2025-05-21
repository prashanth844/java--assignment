package com.operators;

public class Question6 {
    public static void main(String[] args) {
        int a=5;
        int b=2;
        boolean isTrue=false;
        if(a>0 &&a>b){
            System.out.println("a is bigger");
        }
         if(b!=0 || b<a){
             System.out.println("b is valid");
         }
         if(!isTrue){
             System.out.println("given condition is false");
         }
    }
}

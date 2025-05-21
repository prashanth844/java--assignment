package com.modifiers;

public class Question2 extends Question1{
     static  void print(){
         System.out.println("private members cant access");
     }
    public static void main(String[] args) {
        print();
    }
}

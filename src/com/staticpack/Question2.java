package com.staticpack;

public class Question2 {
    String name="jack";
    public static void pName(){
        Question2 q=new Question2();
        System.out.println("instance variable:"+" "+q.name);
    }
    public static void main(String[] args) {
      pName();
    }
}

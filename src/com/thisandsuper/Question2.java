package com.thisandsuper;
class MyClass{
    int num=20;
    String word="hello";
}
public class Question2 extends MyClass{

    public void print(){
        System.out.println("number is:"+super.num);
        System.out.println("word is:"+super.word);
    }

    public static void main(String[] args) {
        Question2 q=new Question2();
        q.print();
    }
}

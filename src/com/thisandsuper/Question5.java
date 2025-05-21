package com.thisandsuper;
class Sample{
    public Sample(){
        System.out.println("super constructer");
    }
}
public class Question5 extends Sample {
    public Question5(){
        super();
        System.out.println("child class constructer");
    }

    public static void main(String[] args) {
        new Question5();
    }
}

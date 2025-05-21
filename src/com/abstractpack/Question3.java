package com.abstractpack;
abstract class Hello{
    public void hello(){
        System.out.println("non abstract method");
    }
    abstract void sample();
}
public class Question3 extends Hello {
    public static void main(String[] args) {
    Question3 q=new Question3();
   q.sample();

}

    @Override
    void sample() {
        System.out.println("abstract method");
    }
}

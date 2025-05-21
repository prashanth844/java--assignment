package com.interfacepack;
class MyClass{
    protected interface Another{
        int num=20;
        void print();
    }
}
public class Question9 implements MyClass.Another {
    @Override
    public void print() {
        System.out.println("protected method from interface"+num);
    }
    public static void main(String[] args) {
        Question9 q=new Question9();
        q.print();
}
}

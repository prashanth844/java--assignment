package com.abstractpack;
abstract class Parent {
    public void display() {
        System.out.println("non abstract method ");
    }

    public abstract void print();
}
    class Child extends Parent {

        @Override
        public void print() {
            System.out.println("abstract method");
        }
    }
    public class Question1 {
        public static void main(String[] args) {
           Parent p=new Child();
           p.display();
           p.print();
    }
}

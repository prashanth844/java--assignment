package com.staticpack;

public class Question1 {
    static String name="jhon";
    static String clgName="sri indu";
    public int age=21;
    public double clgFee=75000.0;

    public static void printName() {
        System.out.println("static method 1");
    }
    public static void printClgName() {
        System.out.println("static method 2");
    }
    public void printAge(){
        System.out.println("instance method 1");
    }
    public void printClgFee(){
        System.out.println("instance method 2");
    }
    public static void main(String[] args) {
     Question1 q = new Question1();
     System.out.println(Question1.name);
     System.out.println(Question1.clgName);
     System.out.println(q.age);
     System.out.println(q.clgFee);
     printName();
     printClgName();
     q.printAge();
     q.printClgFee();
    }
}

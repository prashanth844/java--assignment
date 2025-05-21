package com.modifiers;

public class Question1 {
    private int age;
    private String name;

    private void display(){
        System.out.println("private method");
    }
    public void setAge(){
        age=this.age;
    }
    public void setName(){
        name=this.name;
    }
    public int getAge(){
        return age;
    }
    public String getName(){
        return name;
    }

    public static void main(String[] args) {
        Question1 q= new Question1();
        int rAge=q.age=21;
        String rName=q.name="jhon";
        System.out.println(q.getAge());
        System.out.println(q.getName());
        q.display();
    }
}

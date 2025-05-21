package com.inheritance;

    class A {
        int value = 10;

        void method1() {
            System.out.println("A: method1 (specific to A)");
        }

        void method2() {
            System.out.println("A: method2 (specific to A)");
        }

        void display() {
            System.out.println("A: display (overridden)");
        }
    }

    // Subclass B
    class B extends A {
        int value = 20;

        void method3() {
            System.out.println("B: method3 (specific to B)");
        }

        void method4() {
            System.out.println("B: method4 (specific to B)");
        }

        @Override
        void display() {
            System.out.println("B: display (overridden)");
        }
    }

    // Subclass C
    class C extends B {
        int value = 30;

        void method5() {
            System.out.println("C: method5 (specific to C)");
        }

        void method6() {
            System.out.println("C: method6 (specific to C)");
        }

        @Override
        void display() {
            System.out.println("C: display (overridden)");
        }
    }
public class Question1 {

    public static void main(String[] args) {
        A objA = new A();
        objA.method1();
        objA.method2();
        objA.display();
        System.out.println("A value: " + objA.value);
        System.out.println();


        B objB = new B();
        objB.method1();
        objB.method2();
        objB.method3();
        objB.method4();
        objB.display();
        System.out.println("B value: " + objB.value);
        System.out.println();


        C objC = new C();
        objC.method1();
        objC.method2();
        objC.method3();
        objC.method4();
        objC.method5();
        objC.method6();
        objC.display();
        System.out.println("C value: " + objC.value);
        System.out.println();



      A ref = new B();
        ref.display();
        System.out.println("ref to B, value: " + ref.value);
        System.out.println();

        A a = new C();
        a.display();
        System.out.println("ref to C, value: " + a.value);
    }
}


package com.loops;

import java.util.Scanner;

public class Question11 {
    public static void main(String[] args) {
        System.out.println("enter your number:");
        Scanner sc= new Scanner(System.in);
        int num=sc.nextInt();
        int remainder=num%2;
        switch (remainder){
            case 0:
                System.out.println("even number");
                break;
            case 1:
                System.out.println("odd number");
                break;
            default:
                System.out.println("invalid input");
        }
        sc.close();
    }
}

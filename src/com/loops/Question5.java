package com.loops;

public class Question5 {
    public static void main(String[] args) {
        int a=1;
        int b=7;
        int c=15;
        int maxNumber=0;
        if(a>b&&a>c){
            maxNumber=a;
        } else if (b>a&&b>c) {
            maxNumber=b;
        }else {
            maxNumber=c;
        }
        System.out.println("maximum number is"+" "+maxNumber);
    }
}

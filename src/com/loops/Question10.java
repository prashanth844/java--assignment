package com.loops;

public class Question10 {
    public static void palindrome(int number){
        int temp=number;
        int sum=0;
        while(number>0){
            int rev=number%10;
            sum=(sum*10)+rev;
            number=number/10;
        }
        if(sum==temp){
            System.out.println("given number is palindrome");
        }else {
            System.out.println("given number is not palindrome");
        }
    }
    public static void main(String[] args) {
palindrome(151);
    }
}

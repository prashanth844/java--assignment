package com.arrays;

public class Question19 {
    public static int findMissing(int []arr,int val){
        for(int i=1;i<=arr.length-1;i++){
            int temp=i+1;
            int num2=i;
            if(temp-num2==2){
               val= num2+1;
            }
        }
        return val;
    }
    public static void main(String[] args) {
     int []arr=new int[100];
        int val=56;
        System.out.println(findMissing(arr,val));
    }
}

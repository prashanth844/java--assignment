package com.arrays;

public class Question2 {
    public static void average(int []arr){
        int n=arr.length;
        double avg=0;
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        avg=sum/n;
        System.out.println(avg);
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5,6};
       average(arr);
    }
}

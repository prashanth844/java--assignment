package com.arrays;

public class Question3 {
    public static void main(String[] args) {
        int target=6;
        int arr[]={2,4,6,7,9};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                System.out.println("index number is"+" "+i);
            }
        }
    }
}

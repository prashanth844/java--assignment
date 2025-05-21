package com.arrays;

public class Question4 {
    public static boolean isContains(int []arr,int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true ;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int arr[]={2,4,5,6,8,9};
        int target=4;
        System.out.println(isContains(arr,target));
    }
}

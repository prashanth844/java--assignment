package com.arrays;

public class Question16 {
    public static int calDifference(int []arr){
        int min=arr[0];
        int max=arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }else {
                min=arr[i];
            }
        }
        return max-min;
    }
    public static void main(String[] args) {
        int []arr={1,2,3,4,5};
        System.out.println(calDifference(arr));
    }
}

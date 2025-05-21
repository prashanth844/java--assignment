package com.arrays;

public class Question8 {
    public static void print(int []arr){
    int min=arr[0];
    int max=arr[0];
        for(int i=0;i<arr.length;i++) {
            if (arr[i] > max) {
                max = arr[i];
            } else {
                min = arr[i];
            }
        }
            System.out.println("max value"+" "+max);
            System.out.println("min val"+" "+min);
    }
    public static void main(String []args) {
            int[]arr={1, 2, 3, 4, 5};
            print(arr);
    }
}

package com.arrays;

public class Question15 {
    public static void print(int []arr){
        int evenCount=0;
        int oddCount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]%2==0){
                evenCount++;
            }else {
                oddCount++;
            }
        }
        System.out.println("even numbers count"+" "+evenCount);
        System.out.println("odd numbers count"+" "+oddCount);
    }
    public static void main(String[] args) {
        int []arr={17,24,51,33,4,8};
          print(arr);
    }
}

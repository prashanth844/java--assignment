package com.arrays;

public class Question10 {
    public static void findDuplicates(int []arr){
         for(int i=0;i<arr.length;i++){
             for(int j=i+1;j<arr.length-1;j++){
                 if(arr[i]==arr[j]){
                     System.out.println("duplicate is"+" "+arr[i]);
                 }
             }
         }
    }
    public static void main(String[] args) {
        int []arr={1,2,2,3,3,4,5};
        findDuplicates(arr);
    }
}

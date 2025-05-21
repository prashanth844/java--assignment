package com.arrays;

public class Question12 {
    public static void removeDuplicates(int []arr) {
        int temp = 0;
        int nums[] = new int[arr.length];
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] != arr[i + 1]) {
                nums[temp++] = arr[i];
            }
        }
            nums[temp++]=arr[arr.length-1];
            for(int k=0;k<temp;k++) {
                System.out.println(nums[k]);
        }
    }
    public static void main(String[] args) {
        int arr[]={1,2,2,3,4,4,5};
        removeDuplicates(arr);
    }
}

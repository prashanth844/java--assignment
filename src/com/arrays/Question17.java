package com.arrays;

public class Question17 {
    public static boolean containsElements(int[] arr) {
        boolean has12 = false;
        boolean has23 = false;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 12) {
                has12 = true;
            }
            if (arr[i] == 23) {
                has23 = true;
            }
        }

        return has12 && has23;
    }
    public static void main(String[] args) {
        int arr[] = {10, 12, 5, 6, 23};

        if (containsElements(arr)) {
            System.out.println("Array contains both 12 and 23.");
        } else {
            System.out.println("Array does not contain both 12 and 23.");
        }
    }
}

package com.arrays;
import java.util.Arrays;
public class Question5 {
    public static int[] removeElement(int[] arr, int target) {
        int count = 0;
        for (int value : arr) {
            if (value != target) {
                count++;
            }
        }
        int[] result = new int[count];
        int index = 0;
        for (int value : arr) {
            if (value != target) {
                result[index++] = value;
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 30, 50};

        int target = 30;

        int[] updatedArray = removeElement(numbers, target);

        System.out.println("Array after removing " + target + ": " + Arrays.toString(updatedArray));
    }
}

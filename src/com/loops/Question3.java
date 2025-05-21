package com.loops;

public class Question3 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        int target = 3;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                System.out.println(numbers[i] + " is equal to " + target);
            } else if (numbers[i] != target) {
                System.out.println(numbers[i] + " is not equal to " + target);
            }
        }
    }
}

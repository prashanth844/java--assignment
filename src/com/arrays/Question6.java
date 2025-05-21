package com.arrays;

public class Question6 {
    public static void main(String[] args) {
                int[] original = {1, 2, 3, 4, 5};
                int[] copy = new int[original.length];

                copyArray(original, copy);

                for (int num : copy) {
                    System.out.print(num + " ");
                }
            }

            public static void copyArray(int[] src, int[] dest) {
                for (int i = 0; i < src.length; i++) {
                    dest[i] = src[i];
                }
            }
        }

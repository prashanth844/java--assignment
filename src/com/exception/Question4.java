package com.exception;

public class Question4 {
    public static void main(String[] args) {
        try {
            int result = 10 / 0;

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);

            String str = null;
            System.out.println(str.length());

        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException caught: " + e.getMessage());
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after exception handling.");
    }
}

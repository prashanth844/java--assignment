package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Question2 {
    public static void main(String[] args) {
        try {
            FileInputStream inputStream = new FileInputStream("input.txt");

            int data;
            while ((data = inputStream.read()) != -1) {
                System.out.print((char) data);
            }

            inputStream.close();
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

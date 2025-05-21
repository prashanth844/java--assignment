package com.io;

import java.io.FileInputStream;
import java.io.IOException;

public class Question1 {
    public static void main(String[] args) {
        String filePath = "file1.txt";  // Replace with your file path

        try (FileInputStream inputStream = new FileInputStream(filePath)) {
            int data;
            while ((data = inputStream.read()) != -1) {
                // Cast byte to char
                System.out.print((char) data);
            }
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

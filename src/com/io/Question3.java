package com.io;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class Question3 {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("input.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);

            int data;
            while ((data = bufferedInput.read()) != -1) {
                System.out.print((char) data);
            }

            bufferedInput.close();
            fileInput.close();
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }
    }
}

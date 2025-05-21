package com.exception;
import java.io.FileInputStream;
import java.io.IOException;
public class Question12 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("somefile.txt");
            fis.close();
            int data = fis.read();

        } catch (IOException e) {
            System.out.println("IOException caught: " + e.getMessage());
        }
    }
}

package com.exception;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
public class Question11 {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("no_file.txt");
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException caught: " + e.getMessage());
        }
    }
}

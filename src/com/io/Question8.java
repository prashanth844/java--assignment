package com.io;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Question8 {
    public static void main(String[] args) {
        String content = "This is the first line.\nThis is the second line.";

        try {

            BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));

            writer.write(content);

            writer.close();

            System.out.println("Text successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}

package com.io;
import java.io.FileWriter;
import java.io.IOException;
public class Question6 {
    public static void main(String[] args) {
        String content = "This is a sample text written using FileWriter.";

        try {
            FileWriter writer = new FileWriter("output.txt");

            writer.write(content);

            writer.close();

            System.out.println("Text successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}

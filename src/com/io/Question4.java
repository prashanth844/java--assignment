package com.io;

import java.io.IOException;
import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
public class Question4 {
    public static void main(String[] args) {
        String content = "This is a sample text written using BufferedOutputStream.";

        try {
            FileOutputStream fileOutput = new FileOutputStream("output.txt");

            BufferedOutputStream bufferedOutput = new BufferedOutputStream(fileOutput);

            byte[] contentBytes = content.getBytes();

            bufferedOutput.write(contentBytes);


            bufferedOutput.flush();
            bufferedOutput.close();
            fileOutput.close();

            System.out.println("Text successfully written to output.txt");
        } catch (IOException e) {
            System.out.println("Error writing to the file: " + e.getMessage());
        }
    }
}

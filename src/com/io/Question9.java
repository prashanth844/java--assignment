package com.io;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
public class Question9 {
    public static void main(String[] args) {
        Properties properties = new Properties();

        try {
            FileInputStream input = new FileInputStream("config.properties");
            properties.load(input);

            String username = properties.getProperty("username");
            String password = properties.getProperty("password");
            String url = properties.getProperty("url");

            System.out.println("Username: " + username);
            System.out.println("Password: " + password);
            System.out.println("URL: " + url);

            input.close();
        } catch (IOException e) {
            System.out.println("Error reading properties file: " + e.getMessage());
        }
    }
}

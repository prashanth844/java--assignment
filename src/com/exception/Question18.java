package com.exception;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Question18 {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/nonexistentdb"; // Non-existent DB
        String user = "root";
        String password = "wrongpassword";

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            System.out.println("Connected to database!");
        } catch (SQLException e) {
            System.out.println("SQLException caught: " + e.getMessage());
        }
    }
}

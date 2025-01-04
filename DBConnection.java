package com.test.project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
//	private static final String URL = "jdbc:oracle:thin:@localhost:1521:xe";
//    private static final String USER = "system"; 
//    private static final String PASSWORD = "1011";
    
    private static final String URL="jdbc:oracle:thin:@localhost:1521:xe";
    private static final String USER="system";
    private static final String PASSWORD="1011";
    
//    public static Connection getConnection() {
//        try {
//            return DriverManager.getConnection(URL, USER, PASSWORD);
//        } catch (SQLException e) {
//            e.printStackTrace();
//            throw new RuntimeException("Failed to connect to the database!");
//        }
//    }
    
    public static Connection getConnection() {
    	try {
    		return DriverManager.getConnection(URL,USER,PASSWORD);
    	}catch(SQLException e) {
    		e.printStackTrace();
    		throw new RuntimeException("Faild to connect to the database!");
    	}
    }
}

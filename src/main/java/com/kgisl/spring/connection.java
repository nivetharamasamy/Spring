package com.kgisl.spring;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * connection
 */
public class connection  {
   
    public Connection conn;
    private Statement statement;
    public static connection db;
   public static Connection data() throws SQLException {
            Connection con= DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/nivetha?allowPublicKeyRetrieval=true&useSSL=false&serverTimezone=UTC",
                "root", "");   
     
            return  con;
    }

    
}
package com.java.JDBCTest;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
    private static Connection con= null;

    public static Connection getDBConnection() throws Exception{
        if(con==null){
            ResourceBundle bundle=ResourceBundle.getBundle("com/java/JDBCTest/dbconstants");
            String driverClass= bundle.getString("jdbc.driverclass");
            String url=bundle.getString("jdbc.url");
            String userName=bundle.getString("jdbc.username");
            String password=bundle.getString("jdbc.password");

            Class.forName(driverClass);
            con= DriverManager.getConnection(url,userName,password);
        }
        return con;
    }
}

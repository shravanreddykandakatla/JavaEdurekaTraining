package com.java.JDBCTest;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployee {
    public static void main(String[] args) throws Exception {
        Connection con= ConnectionFactory.getDBConnection();
        Statement st= con.createStatement();
        String sql="insert into emp(empno,ename,sal) values(101,'Shravan',85000),(102,'Manidhar',85000),(103,'Jahnavi',90000),(104,'Aravind',83000),(105,'Vardhan',10)";
        try {

        int response= st.executeUpdate(sql);
            System.out.println("employees saved: "+response);
        } catch (Exception ex){
            System.err.println("Error: "+ex.toString());
        }

    }
}

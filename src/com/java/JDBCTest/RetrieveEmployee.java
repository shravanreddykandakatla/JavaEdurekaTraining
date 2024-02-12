package com.java.JDBCTest;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class RetrieveEmployee {
    public static void main(String[] args) throws Exception {
        Connection con= ConnectionFactory.getDBConnection();
        Statement st= con.createStatement();
        String sql="select * from emp";
        try {

            ResultSet rs= st.executeQuery(sql);
            while (rs.next()){
                int empno=rs.getInt(1);
                String empName=rs.getString(2);
                float sal= rs.getFloat(3);

                String employee= String.format("Employee[%-3d  | %-10s  | %.2f]",empno,empName,sal);
                System.out.println(employee);
            }

        } catch (Exception ex){
            System.err.println("Error: "+ex.toString());
        }

    }
}

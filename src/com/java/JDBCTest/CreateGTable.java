package com.java.JDBCTest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateGTable {
    public static void main(String[] args) throws Exception{
        //step1 initialize JDBC Driver of MySQL
        Class.forName("com.mysql.cj.jdbc.Driver");

        //connect to MY_DB MySQL database
        Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306/SHRAVAN","root", "root");

        //create an object for passing SQL query
        Statement st=con.createStatement();

        String sql="create table emp(empno int, ename varchar(30), sal float(10,2), primary key(empno))";

        //pass the SQL query
        try{
            st.execute(sql);
            System.out.println("Database Table for employee has been created!!!");
        }catch(Exception ex){
            System.err.println("Error: "+ ex.toString());
            ex.printStackTrace();
        }

        //Close the connection with the database

        st.close();
        con.close();
    }
}

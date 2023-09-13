package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchall {
 public static void main(String[] args) {
	 
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_table","root","root");
		Statement st= c.createStatement();
		ResultSet rs=st.executeQuery("select * from emp_table");
	    while(rs.next()) {
	    	System.out.println("the id"+rs.getInt(1));
	    	System.out.println(rs.getInt(2));
	    }
		st.close();
	    c.close();
	 
	} catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
		
		
}


}
package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class delete {
	public static void main(String[] args) {
		
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_table","root","root");
		Statement st= c.createStatement();
		st.executeUpdate("drop table emp_table");
		st.close();
	    c.close();
	 
	} catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
}
}

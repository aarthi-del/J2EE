package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Empolyee {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernate","root","root");
		    java.sql.Statement st=c.createStatement();
		    ResultSet rs=st.executeQuery("select * from employee");
		    while(rs.next()) {
		    	System.out.println(rs.getString(1));
		    }
		} catch (ClassNotFoundException | SQLException e) {
						e.printStackTrace();
		}
		
	}
	
	

}

package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class fetchname {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_table","root","root");
		Statement st= c.createStatement();
		ResultSet rs=st.executeQuery("select ename,company,pno from emp order by  pno desc ;");
		while(rs.next()) {
			 System.out.println("the name is :"+rs.getString(1));
			 System.out.println("the  company name is :"+rs.getString(2));
			 System.out.println("the phone number  is :"+rs.getString(3));
		}
		st.close();
	    c.close();
	 
	} catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
}
}

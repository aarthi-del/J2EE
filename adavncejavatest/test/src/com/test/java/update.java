package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class update {
 public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 System.out.println("enter the email ");
	 String email=s.next();
	 System.out.println("enter the email where ");
	 String cemail=s.next();
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_table","root","root");
		PreparedStatement st= c.prepareStatement("update emp set email=?  where email=?");
		st.setString(1, email);
		st.setString(2, cemail);
		st.executeUpdate();
		System.out.println("update successfully");
		st.close();
	    c.close();
	   
	 
	} catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
		
		
}


}

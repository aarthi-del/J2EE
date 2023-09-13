package com.test.java;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class fetchbyemail {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enetr the mail to select");
		String email =s.next();
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employee_table","root","root");
		PreparedStatement st= c.prepareStatement("select * from emp  where email=?");
		ResultSet rs=st.executeQuery("select * from emp where email=?");
		st.setString(1,email);
		System.out.println(rs.getInt(1));
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		st.close();
	    c.close();
	 
	} catch (ClassNotFoundException  |SQLException e) {
		
		e.printStackTrace();
	}
}
}


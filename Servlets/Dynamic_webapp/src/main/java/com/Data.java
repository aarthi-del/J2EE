package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Data {
 public void save( String Email,String password) {
	 try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/front_end","root","root");
		PreparedStatement ps=c.prepareStatement("insert into data values(?,?)");
		ps.setString(1, Email);
		ps.setString(2, password);
		ps.executeUpdate();
	} catch (ClassNotFoundException | SQLException e) {
		
		e.printStackTrace();
	}
 }
}

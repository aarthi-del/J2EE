package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
//@WebServlet("/getall")
public class Loginpage extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		           int id= Integer.parseInt(req.getParameter("id"));
		           String name=req.getParameter("name");
		           double marks= Double.parseDouble(req.getParameter("marks"));
		           int age= Integer.parseInt(req.getParameter("age"));
		           Long examno= Long.parseLong(req.getParameter("examno"));
		           

	
		           
		        		 try {
		        			Class.forName("com.mysql.cj.jdbc.Driver");
		        			Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/front_end","root","root");
		        			PreparedStatement ps=c.prepareStatement("insert into data1 values(?,?,?,?,?)");
		        			ps.setInt(1,id);
		        			ps.setString(2,name);
		        			ps.setDouble(3,marks);
		        			ps.setInt(4,age);
		        			ps.setLong(5,examno);
		        			
		        			ps.executeUpdate();
		        		} catch (ClassNotFoundException | SQLException e) {
		        			
		        			e.printStackTrace();
		        		}
		        		 
		             res.getWriter().print("<h1>"+"data saved"+"</h1>");
		           
		       
	}}



package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Dynamic extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 Date d =new Date();
		 PrintWriter out = res.getWriter();
		 out.print("<h1>current time :"+d.toString()+"</h1>");
		
	}
	 
 }


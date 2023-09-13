package com;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Loginservlet extends GenericServlet {

	@Override
	
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String Email =req.getParameter("Email");
		String password =req.getParameter("password");
		Data d= new Data();
		d.save(Email, password);
		res.getWriter().print("<h1>data stored</h1>");
		}
	}

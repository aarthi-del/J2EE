package org.edu.servlet_config;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servletconfig2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		ServletConfig config =getServletConfig();
		 String Email=config.getInitParameter("Email");
		 res.getWriter().print(Email);
		
	}

}

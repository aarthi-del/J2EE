package org.edu.servlet_context;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Servlet2 extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
			ServletContext context = getServletContext();
		    String email=context.getInitParameter("Email");
		    res.getWriter().print("<h1> Email :"+email+"</h1>");
		
		
	}

}

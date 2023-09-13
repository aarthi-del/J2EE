package com.edu.session;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/login")
public class login extends HttpServlet{
	
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
    	
    	String email =req.getParameter("email");
    	String pass=req.getParameter("pass");
    	  
    	
    	if (email.equals("aarthim1902@gmail.com")&& pass.equals("1234")) {
    		
    		 HttpSession session=req.getSession();
    		 RequestDispatcher dispatcher=req.getRequestDispatcher("a");
    		 dispatcher.forward(req, resp);
			
		}else {
			resp.getWriter().print("<h1>Invalid Details<h1>");
			RequestDispatcher dispatcher =req.getRequestDispatcher("form.html");
			dispatcher.include(req, resp);
		
		}
    	
    	
      }
	
}

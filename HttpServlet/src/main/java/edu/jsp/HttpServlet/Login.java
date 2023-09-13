package edu.jsp.HttpServlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/login")
public class Login extends HttpServlet{
	public void doPost (HttpServletRequest req,HttpServletResponse resp)throws IOException,ServletException {
		String email=req.getParameter("email");
		String password=req.getParameter("password");
		if(email.equals("tom@gmail.com")&&password.equals("123")) {
			RequestDispatcher dispatcher=req.getRequestDispatcher("Home.html");
			dispatcher.forward(req, resp);
		}else {
			resp.getWriter().print("<h1>Invaild details</h1>");
			RequestDispatcher dispatcher=req.getRequestDispatcher("Login.html");
			dispatcher.include(req, resp);
		}
	}
}

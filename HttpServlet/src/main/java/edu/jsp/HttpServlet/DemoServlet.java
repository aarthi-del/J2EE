package edu.jsp.HttpServlet;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/httpServlet")
public class DemoServlet extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServerException {
		resp.getWriter().print("<h1>Hi I am GET Method</h1");
	}
	@Override
	public void doPost(HttpServletRequest req,HttpServletResponse resp) throws IOException,ServerException {
		resp.getWriter().print("<h1>Hi I am Post Method</h1");
	}
}

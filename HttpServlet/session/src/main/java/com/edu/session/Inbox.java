package com.edu.session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
@WebServlet("/a")
public class Inbox extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String html="<!DOCTYPE html>"
				+ "<html>"
				+ "<head>"
				+ "<meta charset=\"ISO-8859-1\">"
				+ "<title>Insert title here</title>"
				+ "</head>"
				+ "<body>"
				+ "	<table border=\"1px\">"
				+ "		<tr>\r\n"
				+ "			<th>ID</th>"
				+ "			<th>NAME</th>"
				+ "			<th>PAAWORD</th>"
				+ "		</tr>"
				+ "		<tr>"
				+ "			<td>1</td>"
				+ "			<td>Aarthi</td>"
				+ "			<td>aarthim1902@gmail.com</td>"
				+ "			"
				+ "		</tr>"
				+ "	</table>"
				+ "\r\n"
				+ "</body>"
				+ "</html>";
		
		HttpSession session =req.getSession(false);
		
		if(session !=null) {
			resp.getWriter().print(html);
		}else {
			resp.getWriter().print("<h1>Go And Login First</h1>");
			req.getRequestDispatcher("form.html").include(req, resp);
		}
		
		
	}

}

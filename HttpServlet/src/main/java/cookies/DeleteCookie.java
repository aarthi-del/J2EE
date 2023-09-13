package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/deletecookie")
public class DeleteCookie extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie cookie[]=req.getCookies();
		for(Cookie cookie2:cookie) {
			String name=cookie2.getName();
			if(name.equals("pass")) {
				cookie2.setMaxAge(0);
				resp.addCookie(cookie2);
				resp.getWriter().print("<h1>cookies Deleted</h1>");
			}
		}
	}
		
}

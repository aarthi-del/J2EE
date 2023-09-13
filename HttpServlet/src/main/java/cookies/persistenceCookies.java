package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/Addcookies")
public class persistenceCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//Persistence
		Cookie c1=new Cookie("email","tom@gmail.com");
		c1.setMaxAge(60*60);
		//non persistence
		Cookie c2=new Cookie("pass","123");
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.getWriter().print("<h1>Cookies added sucessfully</h1>");
	}
	
}

package cookies;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/addcookies")
public class AddCookies extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Cookie c1=new Cookie("email","tom@gmail.com");
		Cookie c2=new Cookie("pass","123");
		resp.addCookie(c1);
		resp.addCookie(c2);
		resp.getWriter().print("<h1>Cookies add sucessfully</h1>");
	}
	
}

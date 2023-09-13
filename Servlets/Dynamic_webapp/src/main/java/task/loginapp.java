package task;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class loginapp extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		String name=req.getParameter("name");
		String email =req.getParameter("email");
		Long Npass=Long.parseLong(req.getParameter("pass"));
		String pass=req.getParameter("password");
		String cap=req.getParameter("captcha");
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/front_end","root","root");
			PreparedStatement ps=c.prepareStatement("insert into insta values(?,?,?,?,?)");
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setLong(3, Npass);
			ps.setString(4, pass);
			ps.setString(5, cap);
			ps.executeUpdate();
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}
		
		
	}

}

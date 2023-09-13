package com;


import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.*;
import java.sql.Statement;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;




@WebServlet("/GetAll")
public class GetAll extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		    
		 try {
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/front_end","root","root");
				Statement st=  c.createStatement();
				ResultSet rs=st.executeQuery("select * from data1");
			    while(rs.next()) {
			    	String html="<!DOCTYPE html>\r\n"
			    			+ "<html>"
			    			+ "<head>"
			    			+ "<meta charset=\"ISO-8859-1\">"
			    			+ "<title>Insert title here</title>"
			    			+ "</head>"
			    			+ "<body>"
			    			+ "<table border='2' padding='10'>"
			    			+"<tr>"
			    			+"<th>"+ rs.getInt(1)+"</th>"
			    			+"<th>"+ rs.getString(2)+"</th>"
			    			+"<th>"+ rs.getDouble(3)+"</th>"
			    			+"<th>"+ rs.getInt(4)+"</th>"
			    			+"<th>"+ rs.getLong(5)+"</th>"
			    			+"</tr>"
			    		    +"</table>"
			    			+ "</body>"
			    			+ "</html>";	
			    	res.getWriter().print(html);
			    	
			    }
				st.close();
			    c.close();
			 
			} catch (ClassNotFoundException  |SQLException e) {
				
				e.printStackTrace();
			}
				
				
		}

		
	
		
}
	



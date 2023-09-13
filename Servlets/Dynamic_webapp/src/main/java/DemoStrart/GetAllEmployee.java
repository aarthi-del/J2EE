package DemoStrart;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class GetAllEmployee extends GenericServlet{

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		 EntityManager em=emf.createEntityManager();
		 Query q=em.createQuery("select e from EmployeeClass e");
		 List<EmployeeClass> li=q.getResultList();

			String html = "<!DOCTYPE html>"
						+"<html>"
						+"<head>"
						+"<meta charset=\"UTF-8\">"
						+"<title>Insert title here</title>"
						+"</head>"
						+ "<body>"
						+ "  <table border='5px'>"
						+ "        <tr>"
						+ "            <th>"+"id"+"</th>"
						+ "            <th>"+"Name"+"</th>"
						+ "            <th>"+"Company Name"+"</th>"
						+ "            <th>"+"Age"+"</th>"
						+ "            <th>"+"Salary"+"</th>"
						+ "            <th>"+"Email"+"</th>"
						+ "            <th>"+"Password"+"</th>"
						+ "            <th>"+"Phone Number"+"</th>"
						+ "        </tr>";
			
			for (EmployeeClass e:li) {
				html=html+ "<tr>"
						+"<td>"+e.getId()+"</td>"
						+"<td>"+e.getName()+"</td>"
						+"<td>"+e.getCname()+"</td>"
						+"<td>"+e.getAge()+"</td>"
						+"<td>"+e.getSal()+"</td>"
						+"<td>"+e.getEmail()+"</td>"
						+"<td>"+e.getPass()+"</td>"
						+"<td>"+e.getPhno()+"</td>"
						+"</tr>";
		
				
			}
		 
		  res.getWriter().print(html);

		
	}
	

}

package DemoStrart;

import java.io.IOException;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class EmployeeMain extends GenericServlet {

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		
		int id= Integer.parseInt(req.getParameter("id"));
		String name=req.getParameter("name");
		String cname=req.getParameter("cname");
		double sal=Double.parseDouble(req.getParameter("sal"));
		long phno=Long.parseLong(req.getParameter("phno"));
		int age=Integer.parseInt(req.getParameter("age"));
		String email=req.getParameter("email");
		String password =req.getParameter("pass");
		String job =req.getParameter("job");
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		EmployeeClass ec = new EmployeeClass();
		ec.setAge(id);
		ec.setCname(name);
		ec.setCname(cname);
		ec.setSal(sal);
		ec.setPhno(phno);
		ec.setAge(age);
		ec.setEmail(email);
		ec.setPass(password);
		ec.setJob(job);
		
		et.begin();
		em.persist(ec);
		et.commit();
		
		System.out.println("data saved sucessfully");
	
		
		
		
		
		
	}

}

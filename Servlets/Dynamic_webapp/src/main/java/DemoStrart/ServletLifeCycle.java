package DemoStrart;

import java.io.IOException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/servletlifecycle")
public class ServletLifeCycle extends GenericServlet {
	
	 @Override
	public void destroy() {
		 System.out.println("destroy method is called");

	}
	 
	@Override
	public void init() throws ServletException {
		System.out.println("init method is called");//without init method destroy method will call
           }
	
	
	
	
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		System.out.println("service method is called");
		
	}

}

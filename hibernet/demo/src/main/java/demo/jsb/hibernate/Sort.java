package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class Sort {
	
	public static void main(String[] args) {
		  EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		  EntityManager em = emf.createEntityManager();
		  
		    Query q1=em.createQuery("select e from ProductDetails e order by pname desc") ;
		    List<ProductDetails> desc=q1.getResultList();
		    System.out.println(desc);
		    
		    Query q=em.createQuery("select e from ProductDetails e ") ;
		    List<ProductDetails> aesc=q.getResultList();
		    System.out.println(aesc);
		    
		    
		  
		
		
		
		
		
		
		
	
	}

   
	

}

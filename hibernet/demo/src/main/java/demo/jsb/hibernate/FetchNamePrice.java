package demo.jsb.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchNamePrice {
	public static void main(String[] args) {
		  EntityManagerFactory emf =Persistence.createEntityManagerFactory("Aarthi");
		  EntityManager em = emf.createEntityManager();
		  
		    Query q1=em.createQuery("select e.pname,e.price from ProductDetails e ") ;
		    List<Object[]> l=q1.getResultList();
		    for(Object[] o:l) {
		    	System.out.println("name :"+o[0]);
		    	System.out.println("name :"+o[1]);
		    	
		    }
	}

}

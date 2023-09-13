package uniStudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Driver {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Student s=new Student();
		
		s.setName("jithu");
		 
		Address a=new Address();
		a.setCity("chennai");
		a.setState("tamilnadu");
		a.setStreet("8 street");
		a.setZipcode(387645);
		s.setA(a);
		
	
		
		
		et.begin();
		em.persist(s);
    	em.persist(a);
		et.commit();
	}

}

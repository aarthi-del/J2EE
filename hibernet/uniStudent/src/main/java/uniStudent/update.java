package uniStudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class update {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		 Student s=em.find( Student.class, 1);
		 s.setName("anjali");
		 et.begin();
		 em.merge(s);
		 et.commit();
		 System.out.println("updated successfully");
	
	}
}

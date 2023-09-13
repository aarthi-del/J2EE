package uniStudent;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		 Student s=em.find( Student.class, 1);
		 System.out.println(s);
	
	}

}

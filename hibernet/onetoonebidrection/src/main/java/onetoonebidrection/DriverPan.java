package onetoonebidrection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverPan {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		
		PersonPan p=new PersonPan();
		p.setAge(20);
		p.setBgroup("O+");
		p.setGender("Femal");
		p.setName("Madhu");
	   
		
		PanCard c=new PanCard();
		c.setAddress("chennai");
		c.setDob("07/05/2004");
		c.setNationality("indian");
		c.setPanId("erty445");
		c.setPhno(34987654);
		c.setP(p);
		p.setCard(c);
		
		et.begin();
		em.persist(c);
		em.persist(p);
		et.commit();
		System.out.println("updated successfully");
		
		
		
		
	}

}

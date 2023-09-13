package demo.jsb.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DriverClass {
public static void main(String[] args) {
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("Aarthi");
	
	EntityManager em=emf.createEntityManager();
	
	EntityTransaction et =em.getTransaction();
	
	
	Employee e1=new Employee();
	e1.setId(55);
	e1.setName("madhu");
	e1.setSal(20000);
	e1.setPno(4567891239l);
	et.begin();
	em.persist(e1);
	et.commit();
	

  }
}

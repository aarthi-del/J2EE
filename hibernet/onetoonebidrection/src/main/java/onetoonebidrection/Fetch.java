package onetoonebidrection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Fetch {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Aarthi");
		EntityManager em =emf.createEntityManager();
		PersonPan p=em.find(PersonPan.class, 1);
		System.out.println(p);
//		PanCard c=em.find(PanCard.class, "erty445");
//		System.out.println(c);
	}

}
 
package studentunionetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	private String Name;
	
	
	private Address a;


	public int getSid() {
		return Sid;
	}


	public void setSid(int sid) {
		Sid = sid;
	}


	public String getName() {
		return Name;
	}


	public void setName(String name) {
		Name = name;
	}


	public Address getA() {
		return a;
	}


	public void setA(Address a) {
		this.a = a;
	}
	
	
	

}

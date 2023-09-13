package uniStudent;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Sid;
	private String Name;
	
	@OneToOne(fetch = FetchType.EAGER)
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

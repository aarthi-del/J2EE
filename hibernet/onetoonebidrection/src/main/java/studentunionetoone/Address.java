package studentunionetoone;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int Addressid;
	private String Street;
	private String city;
	private String State;
	private long zipcode;
	
	
	


	public int getAddressid() {
		return Addressid;
	}


	public void setAddressid(int addressid) {
		Addressid = addressid;
	}


	public String getStreet() {
		return Street;
	}


	public void setStreet(String street) {
		Street = street;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	public String getState() {
		return State;
	}


	public void setState(String state) {
		State = state;
	}


	public long getZipcode() {
		return zipcode;
	}


	public void setZipcode(long zipcode) {
		this.zipcode = zipcode;
	}


	
	
	

}

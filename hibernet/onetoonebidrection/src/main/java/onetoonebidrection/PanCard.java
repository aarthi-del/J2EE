package onetoonebidrection;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class PanCard {
	@Id
	private String panId;
	private String address;
	private String Nationality;
	private long phno;
	private String dob;
	@OneToOne
	private PersonPan p;

	

	public String getPanId() {
		return panId;
	}

	public void setPanId(String panId) {
		this.panId = panId;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNationality() {
		return Nationality;
	}

	public void setNationality(String nationality) {
		Nationality = nationality;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public PersonPan getPersonPan() {
		return p;
	}

	public void setP(PersonPan p) {
		this.p = p;
	}

	@Override
	public String toString() {
		return "PanCard [panId=" + panId + ", address=" + address + ", Nationality=" + Nationality + ", phno=" + phno
				+ ", dob=" + dob + "]";
	}
	

}

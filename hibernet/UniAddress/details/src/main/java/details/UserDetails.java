package details;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserDetails {
	@Id
	private int userId;
	private String uName;
	private int age;
	private long phno;
	
	private VechicalDetails v;

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getuName() {
		return uName;
	}

	public void setuName(String uName) {
		this.uName = uName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public long getPhno() {
		return phno;
	}

	public void setPhno(long phno) {
		this.phno = phno;
	}

	public VechicalDetails getV() {
		return v;
	}

	public void setV(VechicalDetails v) {
		this.v = v;
	}

	@Override
	public String toString() {
		return "UserDetails [userId=" + userId + ", uName=" + uName + ", age=" + age + ", phno=" + phno + ", v=" + v
				+ "]";
	}
	
	
	
	
}

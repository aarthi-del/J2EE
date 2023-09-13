package onetomany_manytoone_bi;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Staff {
	private String sname;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int sid;
	private String sub;
	
	@OneToMany
	private List<Student> std;
	
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSub() {
		return sub;
	}
	public void setSub(String sub) {
		this.sub = sub;
	}
	
	public List<Student> getStd() {
		return std;
	}
	public void setStd(List<Student> std) {
		this.std = std;
	}
	@Override
	public String toString() {
		return "Staff [sname=" + sname + ", sid=" + sid + ", sub=" + sub + ", std=" + std + "]";
	}
	

}

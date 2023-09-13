package spring;

import java.util.List;
import java.util.Map;

public class employee {
	private int eid;
	private String ename;
	private double sal;
	private String dob;
	private String joiningDate;
	private Map<Integer,String>gatget;
	
	
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getJoiningDate() {
		return joiningDate;
	}
	public void setJoiningDate(String joiningDate) {
		this.joiningDate = joiningDate;
	}
	public Map<Integer, String> getGatget() {
		return gatget;
	}
	public void setGatget(Map<Integer, String> gatget) {
		this.gatget = gatget;
	}
	@Override
	public String toString() {
		return "employee [eid=" + eid + ", ename=" + ename + ", sal=" + sal + ", dob=" + dob + ", joiningDate="
				+ joiningDate + ", gatget=" + gatget + "]";
	}
	
	
	
	
	
	
}
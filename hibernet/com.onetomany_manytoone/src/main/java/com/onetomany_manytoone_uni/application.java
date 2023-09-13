package com.onetomany_manytoone_uni;

import java.util.List;

public class application {
	private int id;
	private String app_name;
	private int size;
	private String rating;
	private String company;
	private String version;
	
	private List<Users> u;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getApp_name() {
		return app_name;
	}

	public void setApp_name(String app_name) {
		this.app_name = app_name;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getVersion() {
		return version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

	public List<Users> getU() {
		return u;
	}

	public void setU(List<Users> u) {
		this.u = u;
	}

	@Override
	public String toString() {
		return "application [id=" + id + ", app_name=" + app_name + ", size=" + size + ", rating=" + rating
				+ ", company=" + company + ", version=" + version + ", u=" + u + "]";
	}
	
	
}

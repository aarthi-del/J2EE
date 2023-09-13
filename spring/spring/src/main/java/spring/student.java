package spring;

public class student {

	
	private int id;
	private String name;
	private long phno;
	private int age;
	private double marks;
	public student(int id, String name, long phno, int age, double marks) {
		super();
		this.id = id;
		this.name = name;
		this.phno = phno;
		this.age = age;
		this.marks = marks;
	}
	@Override
	public String toString() {
		return "student [id=" + id + ", name=" + name + ", phno=" + phno + ", age=" + age + ", marks=" + marks + "]";
	}
	
		
}

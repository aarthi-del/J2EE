package springannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	@Value(value = "1")
	private int id;
	@Value(value = "89")
	private double marks;
	@Value(value = "Aarthi")
	private String name;
	@Value(value = "21")
	private int age;
	@Value(value = "9789701691")
	private  long phno;
	
	@Autowired
	private Idcard i;
	
	
	public Idcard getI() {
		return i;
	}
	public void setI(Idcard i) {
		this.i = i;
	}
	public Student() {
		System.out.println("Object Created");
	}
	public void name() {
		System.out.println("Aarthi");
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", marks=" + marks + ", name=" + name + ", age=" + age + ", phno=" + phno + "]";
	}
	
	
	

}

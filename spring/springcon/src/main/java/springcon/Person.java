package springcon;

public class Person {
	     private int age;
	     private String gender;
	     private int id;
	     private long phno;
         private String name;
         private String email;
         private String password;
         
         
         private address a;


		public int getAge() {
			return age;
		}


		public void setAge(int age) {
			this.age = age;
		}


		public String getGender() {
			return gender;
		}


		public void setGender(String gender) {
			this.gender = gender;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public long getPhno() {
			return phno;
		}


		public void setPhno(long phno) {
			this.phno = phno;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getEmail() {
			return email;
		}


		public void setEmail(String email) {
			this.email = email;
		}


		public String getPassword() {
			return password;
		}


		public void setPassword(String password) {
			this.password = password;
		}


		public address getA() {
			return a;
		}


		public void setA(address a) {
			this.a = a;
		}


		@Override
		public String toString() {
			return "Person [age=" + age + ", gender=" + gender + ", id=" + id + ", phno=" + phno + ", name=" + name
					+ ", email=" + email + ", password=" + password + ", a=" + a + "]";
		}
         
         
         
}

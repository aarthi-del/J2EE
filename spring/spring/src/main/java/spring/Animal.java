package spring;

public class Animal {
	private String name;
	private String color;
	private String sound;
	private String gender;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getSound() {
		return sound;
	}
	public void setSound(String sound) {
		this.sound = sound;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Animal [name=" + name + ", color=" + color + ", sound=" + sound + ", gender=" + gender + "]";
	}
	
	
	
	
	
	

}

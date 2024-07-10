package EmbeddedAndEmbadeble;

import java.util.List;

public class Student {
	private String name;
	private List<String> courses;
	private int age;
	private Address address;
	private int experience;
	public Student(String name, List<String> courses, int age, Address address, int experience) {
		super();
		this.name = name;
		this.courses = courses;
		this.age = age;
		this.address = address;
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getCourses() {
		return courses;
	}
	public void setCourses(List<String> courses) {
		this.courses = courses;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public int getExperience() {
		return experience;
	}
	public void setExperience(int experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", courses=" + courses + ", age=" + age + ", address=" + address
				+ ", experience=" + experience + "]";
	}
	
	

}

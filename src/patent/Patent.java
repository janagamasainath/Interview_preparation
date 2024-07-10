package patent;

import java.util.List;

public class Patent {
	
	private String name;
	private List<String> diseases;
	private int age;
	private String state;
	private double billAmount;
	
	//generate setters and getters
	// generate construction using fields
	//generate toString() method
	
	public Patent(String name, List<String> diseases, int age, String state, double billAmount) {
		super();
		this.name = name;
		this.diseases = diseases;
		this.age = age;
		this.state = state;
		this.billAmount = billAmount;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getDiseases() {
		return diseases;
	}
	public void setDiseases(List<String> diseases) {
		this.diseases = diseases;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public double getBillAmount() {
		return billAmount;
	}
	public void setBillAmount(double billAmount) {
		this.billAmount = billAmount;
	}
	@Override
	public String toString() {
		return "Patent [name=" + name + ", diseases=" + diseases + ", age=" + age + ", state=" + state + ", billAmount="
				+ billAmount + "]";
	}
	

}

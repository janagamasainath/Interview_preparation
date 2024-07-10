package SortingBasedOnExp;

import java.time.LocalDate;
import java.time.Period;

public class Employee {
	private String department;
    private String name;
    private LocalDate dateOfJoining;
    // need to a method getYearsOfService to calculate the age
	
	public Employee(String department, String name, LocalDate dateOfJoining) {
		super();
		this.department = department;
		this.name = name;
		this.dateOfJoining = dateOfJoining;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDateOfJoining() {
		return dateOfJoining;
	}
	public void setDateOfJoining(LocalDate dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}
	@Override
	public String toString() {
		return "Employee [department=" + department + ", name=" + name + ", dateOfJoining=" + dateOfJoining + "]";
	}
	public int getYearsOfService() {
        return Period.between(dateOfJoining, LocalDate.now()).getYears();
    }

}

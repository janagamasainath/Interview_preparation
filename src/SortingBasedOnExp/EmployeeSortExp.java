
package SortingBasedOnExp;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeSortExp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub 
		List<Employee> list = new ArrayList<>();
		list.add(new Employee("IT", "sainath", LocalDate.of(2020, 10, 10)));
		list.add(new Employee("TESTING", "prasad", LocalDate.of(2017, 02, 15)));
		list.add(new Employee("IT", "arun", LocalDate.of(2018, 05, 12)));
		list.add(new Employee("TESTING", "praveen", LocalDate.of(2013, 06, 21)));
		list.add(new Employee("IT", "shiva", LocalDate.of(2023, 10, 1)));
		list.add(new Employee("TESTING", "saisha", LocalDate.of(2021, 02, 13)));
		list.add(new Employee("IT", "kiran", LocalDate.of(2014, 8, 13)));
		list.add(new Employee("TESTING", "paawan", LocalDate.of(2019, 06, 18)));
		
		// finding the employee have morethan 4 years of experience in the depatment "IT"
		List<Employee> collect = list.stream().filter(a->a.getYearsOfService()>4).collect(Collectors.toList());
		List<Employee> collect2 = collect.stream().filter(a->a.getDepartment().equals("IT")).collect(Collectors.toList());
		//collect2.forEach(System.out::println);

		
		List<Employee> collect3 = list.stream().filter(a->a.getYearsOfService()>4).collect(Collectors.toList());
		List<Employee> collect4 = collect3.stream().filter(a->a.getDepartment().equals("IT")).collect(Collectors.toList());
		collect4.forEach(System.out::println);
	}

}

package employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee> list = new ArrayList<>();
		list.add(new Employee("shreyansh", "IT", 29000.00, 19));
		list.add(new Employee("kiran", "HR", 26000.00, 21));
		list.add(new Employee("praveen", "ADMIN", 21000.00, 20));
		list.add(new Employee("sai", "IT", 28000.00, 20));
		list.add(new Employee("arun", "HR", 28000.00, 22));
		list.add(new Employee("devansh", "ADMIN", 25000.00, 20));

		// max salary in each department
		Map<String, Optional<Employee>> collect = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.maxBy(Comparator.comparing(Employee::getSalary))));
		System.out.println(collect);
		
		// youngest person in each department (ADMIN has same age then we are comparing
		// there salary)

		Map<String, Optional<Employee>> collect2 = list.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment,
				Collectors.minBy(Comparator.comparing(Employee::getAge)
						.thenComparing(Employee::getSalary))));
		System.out.println(collect2);
		
	}

}

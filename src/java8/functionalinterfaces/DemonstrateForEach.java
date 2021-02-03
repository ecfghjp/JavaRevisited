package java8.functionalinterfaces;

import java.util.ArrayList;
import java.util.List;

public class DemonstrateForEach {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();

		for (int i = 0; i < 10; i++) {
			Employee employee = new Employee(i, 20 + (i + 1), "Male", "Abhi+i", "Sha" + i);
			employeeList.add(employee);
		}
		
		employeeList.forEach(System.out::println);
	}

}

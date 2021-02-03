package java8.predicates;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import java8.functionalinterfaces.Employee;



/**
 *@since 1.8
 *@author abhishek.ad.sharma
 * 
 * <p>The example below demonstrates the sue of prediates with an employee object
 * The filter method in java.util.streams expects a predicate
 * Predicate is similar to the predicate in math functions i.e. they return boolean
 * Predicate is a functional interface and has only one abstract method returning boolean
 *</p>
 */
public class PredicateExample {

	public static void main(String[] args) {
		List<Employee> employeeList = new ArrayList<>();
		
		for(int i=0;i<10;i++) {
			Employee employee = new Employee(i, 20+(i+1), "Male", "Abhi+i", "Sha"+i);
			employeeList.add(employee);
		}
		employeeList=filterEmployees(employeeList, isAdultMale());
		System.out.println(employeeList);
		
		Stream.of("a1", "a2", "a3")
	    .map(s -> s.substring(1))
	    .mapToInt(Integer::parseInt)
	    .max()
	    .ifPresent(System.out::println);  // 3
	}
	//this form should be used with object lists i.e. to iterate over list element
	public static Predicate<Employee> isAdultMale() {
		return p -> p.getAge() < 25;
	}
	

	public static List<Employee> filterEmployees(List<Employee> employees, Predicate<Employee> predicate) {
		return employees.stream()
				.filter(predicate)
				.collect(Collectors.<Employee>toList());
	}

}

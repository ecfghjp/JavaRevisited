package java8.predicates;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class SimpolePredicateExample {
	
	public static void main(String[] args) {
		List<Integer> intList = Arrays.asList(1,2,3,4,5,6,7,9,10);
//		intList.forEach(x->System.out.println(x));
		//create predicates
		Predicate<Integer> lessThan5 = x-> x < 5;
		Predicate<Integer> divisibleBy2 = x-> (x % 2==0);
		List<Predicate<Integer>> predicates = new ArrayList<>();
		predicates.add(lessThan5);
		predicates.add(divisibleBy2);
		System.out.println(divisibleby2AndLessThan5(intList,predicates));
	}
	
	//filter accepts predicate as an argument
	private static List<Integer> isGreaterThanFive(List<Integer> list){
		return list.stream()
				.filter(x->x<=5)
				.collect(Collectors.toList());
	}
	
	private static List<Integer> divisibleby2AndLessThan5(List<Integer> list,List<Predicate<Integer>> predicates){
		return list.stream()
				.filter(predicates.get(0).and(predicates.get(1)))
				.collect(Collectors.toList());
	}
	
	

}

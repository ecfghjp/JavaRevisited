package java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;

public class LambdaExpressions {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abhi","Tanu");
		//list.forEach(word -> System.out.println(word.toLowerCase()));
		
		list.forEach(System.out::println);
	}

}

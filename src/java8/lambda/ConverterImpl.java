package java8.lambda;

import java.util.stream.Stream;

public class ConverterImpl{
	
	public static void main(String[] args) {
		Stream.of("d2", "a2","a3", "b1", "b3", "c")
	    .filter(s -> {
	        System.out.println("filter: " + s);
	        return s.startsWith("a");
	    })
	    .forEach(s -> System.out.println("forEach: " + s));
	}

}

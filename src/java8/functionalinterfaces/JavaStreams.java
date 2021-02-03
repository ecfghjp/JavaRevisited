package java8.functionalinterfaces;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaStreams {
	
	public static void main(String[] args) {
		//create a stream
		Stream<Integer> intStream = Stream.of(1,2,3,4,5);
		//intStream.forEach(value -> System.out.println(value));
		
		//create stream from array
		Integer[] arr = new Integer[]{1,2,3,4,5,6,7,8,9};
		Stream<Integer> stream = Stream.of(arr);
       // stream.forEach(p -> System.out.println(p));
        
      //create stream from array
      		List<Integer> list = Arrays.asList(new Integer[]{1,2,3,4,5,6,7,8,9});
      		Stream<Integer> listStream = list.stream();
      		//listStream.forEach(p -> System.out.println(p));
      		
    
            List<Integer> evenNumbersList = listStream.filter(i -> i%2 == 0)
                                                   .collect(Collectors.toList());
            System.out.print(evenNumbersList);
      		
      

	}

}

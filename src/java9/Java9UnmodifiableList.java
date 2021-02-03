package java9;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Java9UnmodifiableList {
	
	public static void main(String[] args) {
		List<String> list = Arrays.asList("Abhi","Tanu");
		List<String> unmod = Collections.unmodifiableList(list);
		
		//cannot do this 

//		System.out.println(list.equals(unmod));
//		System.out.println(unmod);
		
		//using List.of
		List immutableList = List.of(Arrays.asList("Abhi","Tanu"));
		immutableList.add("abc");
		
		

		
	}

}

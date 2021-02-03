package java9;

import java.util.Arrays;
import java.util.List;

public class StreamsApi {
	public static void main(String[] args) {
		List<Integer> ints = Arrays.asList(1,2,3,3,3,4);
		ints.stream()
			.dropWhile(p->p!=3)
			.takeWhile(x->x==3)
			.forEach(System.out::println);
	}
}

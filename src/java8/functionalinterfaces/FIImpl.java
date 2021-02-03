package java8.functionalinterfaces;

public class FIImpl {
	
	public static void main(String args[]) {
		MyFunctionalInterface myFunctionalInterface = (name,age) -> ""+name+age;
		System.out.println(myFunctionalInterface.sayHello("Abhishek", 20));
		myFunctionalInterface.moreInfo();
		myFunctionalInterface.moreMoreInfo();
		
		//run as functional interface
		Runnable runnable = () -> {
			System.out.println("STarting thread");
		};
		
		new Thread(runnable).start();
		
		//Using Functional Interfaces as Lambda Expressions examples
		MathsOperation addition = (a, b) -> a + b;
		System.out.println(addition.sum(10, 20));
		MathsSubstraction sunstraction = (a, b) -> a - b;
		System.out.println(sunstraction.sub(10, 20));


	}
	
	
	interface MathsOperation{
		public int sum(int a, int b);
	}
	
	interface MathsSubstraction{
		public int sub(int a, int b);
	}
	

}

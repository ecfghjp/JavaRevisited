package java8.functionalinterfaces;

public interface MyFunctionalInterface {
	
	public String sayHello(String name,int age);
	
	default void moreInfo() {
		System.out.println("know more about me please");
	}
	
	default void moreMoreInfo() {
		System.out.println("Even more");
	}


}

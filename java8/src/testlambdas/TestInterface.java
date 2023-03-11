package testlambdas;

//A functional interface can have default methods and static methods.can have n number of default and static methods.
@FunctionalInterface
public interface TestInterface {
	public double method();
	
	public default void method2() {
		System.out.println("from method2");
	}
	
	public static void method3() {
		System.out.println("from static method");
	}
	
}

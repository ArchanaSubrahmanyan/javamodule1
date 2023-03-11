package oopsday5;

public class TestFinal {
	int a=b; //b is forward referenced
	static int b=10;
	final static double pi=3.14;
	//final means compile time constant;before compiling final value will be allocated. saves memory and increases speed of the program
	
	public static void main(String[] args) {
		System.out.println(pi);
	}
	
}

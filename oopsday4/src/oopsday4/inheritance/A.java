package oopsday4.inheritance;

public class A {
	private int x;
	//what is private to base class , the inherited class cannot access it
	private int y;
	A(){
		System.out.println("from A()");
	}
	public A(int x, int y) {
		super();
		this.x = x;
		this.y = y;
		System.out.println("from A(int,int)");
	}
}

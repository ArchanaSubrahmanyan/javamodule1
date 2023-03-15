package oopsday4.composition;

//A is the base class and B is the inherited class
public class B extends A {

	/*B(){
		//System.out.println(x+y);// here error since x is private
	}
	*/
	public B() {
		super(10,20);//it change the behaviour of default constructor and call the parametrized constructor of parent class
		//super should be in the first uncommented line inside the constructor
		//constructor call always should be in the first line
	}
	
}

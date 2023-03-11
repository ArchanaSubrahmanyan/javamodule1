package testlambdas;

@FunctionalInterface
interface Shape {
	double area();
	//double parameter();// if an interface is functional interface,only one method is allowed in that interface.Multiple methods are not allowed

}


interface Math{
	
	double power(int b,int e);
}

interface Factorial{
	
	double fact(int n);
}

public class Example1 {

	public static void main(String[] args) {
		int a=10;
		Shape s = () -> {
			return 0.0;
		};
		double result = s.area();
		System.out.println(result);
		
		//we cannot define a method inside a lambda
		Math m = (int b, int e)->{
			int p=1;
			for(int i=1;i<=e;i++) {
				p*=b;    //p=p*b; 1*
			}
			return p;
		};
		double power = m.power(2, 3);
		System.out.println(power);
		
		Runnable r =()->{
			for(int i=1;i<5;i++) {
				System.out.println("in run method"+ i+a); //any variable which is declared inside main can be accessed 
			}
		};
		Thread t = new Thread(r);
		t.start();
		
		Runnable r1 = new Runnable() {
		public void run() {
			System.out.println("from run method");
		}
		};
		Thread t1 = new Thread(r1);
		t1.start();
		
		Factorial f = (int n)->{
			int fact=1;
			for(int i=2;i<=n;i++) {
				fact=fact*i;
			}
			return fact;
		};
		double factorial = f.fact(5);
		System.out.println(factorial);
	}
}



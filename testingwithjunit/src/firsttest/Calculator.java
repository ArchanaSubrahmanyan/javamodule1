package firsttest;

public class Calculator {

	public int power(int b, int e) {
		int p=1;
		int i=1;
		
		if(b==0||e==0)
			return 0;
		else {
			while (i<=e) {
				p*=b;
			}
		}
		 return p;
	}
	
	public int factorial(int n) {
		int fact=1;
		for(int i=2;i<=n;i++) {
			fact=fact*i;
		}
		return fact;
	}
	
	public boolean even(int n) {
		if(n%2==0)
			return true;
		else
			return false;
	}
}

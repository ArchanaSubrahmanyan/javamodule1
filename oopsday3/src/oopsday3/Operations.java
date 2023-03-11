package oopsday3;

public class Operations implements MathIface {

	
	
	private int number;
	
	public Operations() {
		
	}

	public Operations(int number) {
		super();
		this.number = number;
	}
	
	


	public int getNumber() {
		return number;
	}


	public void setNumber(int number) {
		this.number = number;
	}


	public void PositiveOrNegative() {
		if(this.number > 0)
		System.out.println("Number is positive");
		else
			System.out.println("Number is negative");
	}

	@Override
	public void EvenOrOdd() {
		if(this.number%2==0)
			System.out.println("Number is even");
		else
			System.out.println("Number is odd");
	}
	

	@Override
	public void SumOfNumbers() {
		int sum=0;
		for(int i=1;i<=this.number;i++)
		{
			sum=sum+i;
			
		}
		System.out.println(sum);
		
	}

	@Override
	public void Factorial() {
		int fact=1;
		for(int i=1;i<=this.number;i++) 
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}

	@Override
	public void PrimeOrNot() {
		
		
	}

	@Override
	public void Reverse() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void ArmstrongNumber() {
		// TODO Auto-generated method stub
		
	}

}

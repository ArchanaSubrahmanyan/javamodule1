package StateMachine;
import java.util.Scanner;

public  class Ifunction implements stateIface {
	BankDemo[] objArr = new BankDemo[2];
	Scanner sc = new Scanner(System.in);

	@Override
	public double amount() {
		objArr[0]= new BankDemo(100,2);
		objArr[1]= new BankDemo(50,5);
		BankDemo b1= new BankDemo();
		//System.out.println("Enter your denomination");
		int f=0;
		
		while(f<3) {
			System.out.println("Enter the amount");
			double amt = sc.nextDouble();
			double dnt1=denomination();
			for(int k=0;k<objArr.length;k++) {
				if(dnt1==objArr[k].value) {
					int co = objArr[k].getdCount();
				}
				
			}
			if(amt%dnt1==0) {
				double div = amt/dnt1;
				if(div < co)
				{
					
				}
			}
			
		}
		
		
		
	}

	@Override
	public double denomination() {
		for(int i=0;i<objArr.length;i++) {
			
			System.out.println(objArr[i].value);
			
		}
		System.out.println("");
		System.out.println("enter denomination");
		Scanner sc1=new Scanner(System.in);
		double dnt=sc1.nextDouble();
		for(int j=0;j<objArr.length;j++) {
			if(dnt==objArr[j].value) {
				return objArr[j].getValue();
			}
			else
				System.out.println("Enter the correct denomination");
		}

		
		
	}

	
	public double balance(int bln) {
		// TODO Auto-generated method stub
		return 0;
	}

}

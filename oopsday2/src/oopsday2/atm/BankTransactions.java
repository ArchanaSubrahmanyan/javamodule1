package oopsday2.atm;

public class BankTransactions {

	public static void main(String[] args) {
		
		BankingIface bom = new BankOfAmerica();
		
		//System.out.println("Balance before deposit = $"+bom.balanceEnquiry(10010));
		double balance= bom.deposit(250);
		System.out.println("Balance after deposit = $"+ balance);
		balance=bom.withdraw(250);
		System.out.println("Balance after withdraw =$"+balance);
		

		
	}

}

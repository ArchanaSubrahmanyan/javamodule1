package oopsday3.atm.menu;

import oopsday3.atm.exception.InsufficientFundsException;
import oopsday3.atm.exception.NegativeAmountException;

public interface BankingIface2 {
	public abstract double withdraw(double amount,int actno) throws InsufficientFundsException;
	public abstract double deposit(double amount,int actno) throws NegativeAmountException;
	public double balanceEnquiry(int actno);
}

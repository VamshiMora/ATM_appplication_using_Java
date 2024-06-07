package bankingapplication;

import bankingapplication.Bank;

public class ATM implements Bank {
    
	int balance = 10000;
	
	@Override
	public void deposit(int amount) {
		
		System.out.println("Depositing Rs: "+amount);
		balance = balance +amount;
		System.out.println("Amount deposited Sucessfullly");
	}
	@Override
	public void withdraw(int amount) {
		
		System.out.println("Withdrawing Rs: "+amount);
		balance = balance - amount;
		System.out.println("Amount Withdrawn Sucesfully");
	}
	@Override
	public void checkBalance() {
		System.out.println("Available balance Rs:"+balance);
		
		
	}
	
}

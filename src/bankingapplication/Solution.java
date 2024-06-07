package bankingapplication;
import java.util.Scanner;
import bankingapplication.ATM;
import bankingapplication.Bank;

public class Solution {
	
		public static void main(String[] args) {
			
			System.out.println("Welcome to ATM");
			
			int balance = 10000;
			
			Bank b =new ATM();
			
			Scanner s= new Scanner(System.in);
			
			while(true) {
				
				System.out.println("Enter choice\n1:Deposit\n2:Withdrawl\n3:Balance\n4:Exit");
				int choice = s.nextInt();
				
				
				switch(choice) {
				
				case 1:
				   System.out.println("Enter amount to be Deposited");
				   int dAmt = s.nextInt();
				   b.deposit(dAmt);
				   break;
				
				case 2:
				  System.out.println("Enter amount to be Withdrawn");
				  int wAmt = s.nextInt();
				  
				  if(wAmt>balance) {
				
					  System.out.println("Insufficient Balance!!");
					  System.out.println("--------------------------------2");
					  continue;
				  }
				  b.withdraw(wAmt);
				  break;
				  
				case 3:
					b.checkBalance();
					break;
					
				case 4:
					System.out.println("Thank you");
					System.exit(0);
					
					
				default :
					System.out.println("Invalid Choice");
				  
				
				   }
				System.out.println("--------------------------------");
				
			    }
				
				
			}
		
			
		}


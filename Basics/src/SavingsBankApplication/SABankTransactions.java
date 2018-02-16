package SavingsBankApplication;
import java.util.*;
public class SABankTransactions {
	static int rdeposit,withdraw;
	public static void main(String[] args) {

		SavingsAccount sa=new SavingsAccount();
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			
			System.out.println("Bank Transactions");
			System.out.println("1:To Enter Customer Details");
			System.out.println("2:To See Customer Details");
			System.out.println("3:To Deposit Amount");
			System.out.println("4:To WithDraw Amount");
			System.out.println("5:To Know the Balance in your Account");
			System.out.println("6:Exit The Trasaction");
			System.out.println("Please Enter your Choice:");
			int choice=sc.nextInt();
			switch(choice)
			{
			case 1: sa.createNewAccount();
			break;
			case 2:sa.customerDetails();
			break;
			case 3:
				System.out.println("Please Enter The Amount How much you want to Deposit:");
				int deposit=sc.nextInt();
				 rdeposit =sa.Deposit(deposit);
				 System.out.println("Your Deposited Amount is:"+rdeposit);
				
			break;
			case 4:
				withdraw=sa.withdrawal(rdeposit);
				break;
			case 5: int x=sa.balance(withdraw,rdeposit);
			       System.out.println("Your Account Balance is:"+x);
			break;
			case 6:
				System.out.println("Your Applcation is Exited");
				System.exit(0);
			break;	
			}
		}
	}

}

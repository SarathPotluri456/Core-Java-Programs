package SavingsBankApplication;
import java.util.*;
public class SavingsAccount implements AccountContents, StigentechBank {
       Scanner sc=new Scanner(System.in);
       Customer cus=new Customer();
 int deposit;
       int withdrawl;
	@Override
	public void createNewAccount() {
		
		System.out.println("Please Enter Account Number");
		String accountno=sc.next();
           cus.setAccountno(accountno);	
        System.out.println("Please Enter Your First Name:");
          String Fname=sc.next();
          cus.setFirstName(Fname);
        System.out.println("Please Enter Your Second Name");
          String Lname=sc.next();
          cus.setLastName(Lname);
        System.out.println("Please Enter Your Address");
          String Addr=sc.next();
          cus.setAddress(Addr);
        System.out.println("Please Enter Age"); 
         int age=sc.nextInt();
        System.out.println("Please Enter Gender");
        String gender=sc.next();
        System.out.println("Please Enter Mobile Number");
        long mobi=sc.nextLong();
        }

	@Override
	public void customerDetails() {
	    System.out.println("The Account Number of Customer: "+cus.getAccountno());
	    System.out.println("The Full Name of Customer: "+cus.getFirstName()+" "+cus.getLastName());
	    System.out.println("The Address of Customer:"+cus.getAddress());
	    System.out.println("The Age of Customer"+cus.getAge());
	    System.out.println("The Gender of Customer"+cus.getGender());
	    System.out.println("The Mobile Number of Customer"+cus.getMobiNo());
	    
		
	}

	@Override
	public int Deposit(int deposit) {
		
		if(deposit>1000)
		{
			return deposit;
		}
		else
		{
			System.out.println("please Deposit Sufficiant amount");
		}
		return 0;
		
		
	}

	@Override
	public  int withdrawal(int x) {
		System.out.println("Enter How much amount you want to withdraw");
		int withdrawl=sc.nextInt();
		if(withdrawl<=x)
		{
			System.out.println("Your WithDrawl Amount is"+withdrawl);
			return withdrawl;
			
		}
		else
		{
			System.out.println("You don't Have Sufficiant amount in your Account");
		}
		return 0;
		
	}

	@Override
	public int balance(int withdraw,int deposit) {
		  if(deposit>withdraw)
		  {
		int balance=deposit-withdraw;
		 return balance;
		  }
		return 0;  
	}

}

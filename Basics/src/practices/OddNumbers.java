package practices;
import java.util.*;
public class OddNumbers {
	public static void main(String []args)
	{
		System.out.println("Give the Starting Number");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Give the Ending Number");
		int b=sc.nextInt();
		if(a<b)
		{
			System.out.println("The Odd numbers between "+a+" and "+b+" are:");
			for(int i=a;i<=b;i++)
			{
				if(i%2==1)
				{
					System.out.println(i);
				}
			}
		}
		else
		{
			System.out.println("Please Enter Proper Starting and Ending Values");
		}
	}

}

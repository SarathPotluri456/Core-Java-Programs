package practices;
import java.util.*;
public class PalendromNumber {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the Number for Checking:");
		int sum=0;
		int a=sc.nextInt();
		if(a<0)
		{
			System.out.println("Please Enter Positive value:");
		}
		else
		{
			int temp=a;
			while(temp>0)
			{
				int r=temp%10;
				sum=sum*10+r;
				temp=temp/10;
			}
			if(a==sum)
			{
				System.out.println("Given Number is Palendrem");
			}
			else
				System.out.println("Given Number is not Palendrem");
		}
	}

}

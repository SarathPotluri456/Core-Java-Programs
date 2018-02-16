package practices;
import java.util.*;
public class PerfectNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Enter Number for Checking:");
		int a=sc.nextInt();
		int sum=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				sum=sum+i;
			}
		}
		if((sum/2)==a)
		{
			System.out.println("Given number is perfect");
		}
		else
			System.out.println("Given number is not perfect");

	}

}

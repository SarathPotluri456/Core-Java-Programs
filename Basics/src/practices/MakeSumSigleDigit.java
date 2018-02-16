package practices;
import java.util.*;
public class MakeSumSigleDigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give the number");
		int a=sc.nextInt();
		int temp=a;
		int sum=0,sum2=0;
		while(temp>0)
		{
			int r=temp%10;
			sum=sum+r;
			temp=temp/10;
		}
		if(sum>=10)
		{
			int sum1=sum;
			while(sum1>0)
			{
				int r=sum1%10;
				sum2=sum2+r;
				sum1=sum1/10;
			}
			System.out.println("the sum value is "+sum+" final Sigle Digit: "+sum2);
		}
		else
		{
			System.out.println("The Sum of Digits value"+sum);
			
		}
	}

}

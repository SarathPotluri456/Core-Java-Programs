package practices;
import java.util.*;
public class SumOfDigits {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number To Find Sum Of Digits");
		int a=sc.nextInt();
		int b=a;
		int sum=0;
		int r;
		while(b>0)
		{
			r=b%10;
			b=b/10;
			sum=sum+r;
		}
			
		System.out.println("The Sum Of Digits of Given Number is:"+sum);
		System.out.println(Math.PI);
	}

}

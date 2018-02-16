package practices;
import java.util.*;
public class CheckNUmbersDigitsEqualrNot {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		if(a>25 && b<100)
		{
		int r=a%10;
		int r1=b%10;
		a=a/10;
		b=b/10;
		if(r==r1 || r1==a||a==b ||b==r ||r1==b)
		{
			System.out.println("TRUE");
		}
		}
		else
			System.out.println("FALSE");
	}

}

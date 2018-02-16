package practices;
import java.util.*;
public class ThreeIntCheck {
	void check(int a,int b,int c)
	{
	if((a==b)||(b==c)||(c==a))
	{
		System.out.println("True");
	}
	else
		System.out.println("False");
	}
	public static void main(String []args)
	{
		System.out.println("Enter First NUmber");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter Second NUmber");
		int b=sc.nextInt();
		System.out.println("Enter Thired NUmber");
		int c=sc.nextInt();
		int r1,r2,r3;
		r1=a%10;
		r2=b%10;
		r3=c%10;
		ThreeIntCheck ti=new ThreeIntCheck();
		ti.check(r1,r2,r3);
		
		
		
	}

}

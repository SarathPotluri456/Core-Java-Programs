package practices;
import java.util.*;
public class Swap {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		b=a+b;
		a=b-a;
		b=b-a;
		System.out.println("After Swapping A and B values");
		System.out.println(a+","+b);
	}
	

}

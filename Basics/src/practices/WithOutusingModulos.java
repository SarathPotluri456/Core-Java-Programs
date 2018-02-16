package practices;
import java.util.*;
public class WithOutusingModulos {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Divident:");
		int a=sc.nextInt();
		System.out.println("Enter Divisor");
		int b=sc.nextInt();
		if(a>b)
		{
			int c=a/b;
			int r=a-(b*c);
			System.out.println("The Modulo Division Value:"+r);
		}
		else
		{
			System.out.println("Please Enter Proper Values");
		}
	}

}

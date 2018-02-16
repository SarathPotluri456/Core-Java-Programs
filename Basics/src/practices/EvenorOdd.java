package practices;
import java.util.*;
public class EvenorOdd {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Please Give the number for checking:");
		int a=sc.nextInt();
		if(a%2==0)
		{
			System.out.println("0");
		}
		else
		{
			System.out.println("1");
		}
	}

}

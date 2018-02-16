package basicOperations;
import java.util.*;
public class WithOutUsingArth {
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Value:");
		int a=sc.nextInt();
		System.out.println("Enter B Value:");
		int b=sc.nextInt();
		while(b>0)
		{
			a++;
			b--;
		}
		System.out.println("Sum of a,b:"+a);
		
	}

}

package practices;
import java.util.*;
public class AvgArray {
	public static void main(String []args)
	{
		int l;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter How Many Array Elements you want to insert");
		l=sc.nextInt();
		int []a=new int[l];
		for(int i=0;i<l;i++)
		{
			System.out.println("Enter a["+i+"]");
			a[i]=sc.nextInt();
			
		}
		System.out.println("The Array Values are:");
		for(int i=0;i<l;i++)
		{
			
			System.out.println("a["+i+"]"+a[i]);
		}
		System.out.println("The Avg of Array is");
		for(int i=0;i<l;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum/l);
		
		
		
	}

}

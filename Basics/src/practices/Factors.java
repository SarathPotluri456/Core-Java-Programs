package practices;
import java.util.*;
public class Factors {
	public static void main(String []args)
	{
		System.out.println("Enter The Number to find Factors:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int cnt=0;
		for(int i=1;i<=a;i++)
		{
			if(a%i==0)
			{
				cnt++;
				System.out.println(i);
			}
		}
		System.out.println("The Number Of Factors:"+cnt);
	}

}

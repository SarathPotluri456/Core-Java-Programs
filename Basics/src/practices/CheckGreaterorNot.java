package practices;
import java.util.*;
public class CheckGreaterorNot {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First Number:");
		int a=sc.nextInt();
		System.out.println("Enter Second Number");
		int b=sc.nextInt();
		if(a>b)
		{
		  System.out.println("The Largest value"+a);	
		}
		else if(a==b)
		{
			System.out.println("Bth are Equal:0");
		}
		else if(a%6==b%6)
		{
			System.out.println("The Smaller Value:"+a);
		}
		else
		{
			 System.out.println("The Largest value"+b);	
		}

	}

}

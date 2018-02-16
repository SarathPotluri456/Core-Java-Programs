package basicOperations;
import java.util.*;
public class ReverseString {
	public static void main(String []args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Base String");
		char []s=sc.nextLine().toCharArray();
		System.out.println("The Reversed String");
		for(int i=s.length-1;i>=0;i--)
		{
			System.out.print(s[i]);
		}
		
	}

}

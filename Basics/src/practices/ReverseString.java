package practices;
import java.util.*;
public class ReverseString {
	public static void main(String []args)
	{
	
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String");
		char []letters=sc.nextLine().toCharArray();
		for(int i=letters.length-1;i>=0;i--)
		{
			System.out.print(letters[i]);
		}
		
		
		
	}

}

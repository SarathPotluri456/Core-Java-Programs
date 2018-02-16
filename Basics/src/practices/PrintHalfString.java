package practices;
import java.util.*;
public class PrintHalfString {
	public static void main(String []args)
	{
		System.out.println("Enter The string:");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println("The Half String is:"+s.substring(0, (s.length())/2));
	}

}

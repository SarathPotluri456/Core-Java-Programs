package practices;
import java.util.*;
public class Sqrt {

	public static void main(String[] args) {
		System.out.println("Please Enter The Value To find SqureRoot");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		if(a<=0)
		{
			System.out.println("Please Enter Proper Value");
		}
		else
		{
			int b=(int) Math.sqrt(a);
			System.out.println("The Squre root of "+a+" is:"+b);
		}

	}

}

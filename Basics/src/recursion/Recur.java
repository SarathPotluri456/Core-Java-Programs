package recursion;
import java.util.*;
public class Recur {
	int sum=1;
	int fact(int n)
	{
		if(n>0)
		{
			sum=sum*n;
			n--;
			fact(n);
		}
		return sum;
	}
	
	

	public static void main(String[] args) {
	    System.out.println("Please Enter which number you want to find the factorial:");
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		Recur r=new Recur();
		int fact=r.fact(a);
		System.out.println("The Factorial of "+a+" is:"+fact);

	}

}

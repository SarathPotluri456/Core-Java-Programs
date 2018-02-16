package practices;
import java.util.*;
public class DividingHrMinSec {
	public static void main(String []args)
	{
		System.out.println("Please Enter The Seconds");
		Scanner sc=new Scanner(System.in);
		int sec=sc.nextInt();
		int hr,min,sec1;
		hr=sec/3600;
		int hr1=sec-(hr*3600);
		 min=hr1/60;
		  sec1=hr1-(min*60);
		 System.out.println(hr+":"+min+":"+sec1);
		
	}

}

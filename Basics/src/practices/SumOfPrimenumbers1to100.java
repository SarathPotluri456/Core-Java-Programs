package practices;

public class SumOfPrimenumbers1to100 { 
	public static void main(String []args)
	{
		int sum=0;
		System.out.println("The Prime numbers between 1 ot 100 are:");
		for(int i=1;i<=100;i++)
		{ int cnt=0;
			for(int j=1;j<=i;j++)
			{
				if(i%j==0)
				{
					cnt++;
				}
			}
			if(cnt==2)
			{
				sum=sum+i;
				System.out.println(i);
			}
		}
		System.out.println("Thw Sum of prime numbers between 1 to 100 :"+sum);
	}

}

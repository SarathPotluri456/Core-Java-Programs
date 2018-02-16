package practices;

public class UniqueThreeDigitNumber {

	public static void main(String []args)
	{
		int i,j,k,cnt=0;
		for(i=1;i<=4;i++)
		{
			for(j=1;j<=4;j++)
			{
				for(k=1;k<=4;k++)
				{
					if(k!=i && k!=j && i!=j)
					{
						cnt++;
						System.out.println(i+""+j+""+k);
					}
				}
			}
		}
		System.out.println("Total Unique Three Digit Numbers"+cnt);
	}
}

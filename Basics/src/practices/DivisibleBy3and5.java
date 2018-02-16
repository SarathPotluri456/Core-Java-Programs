package practices;

public class DivisibleBy3and5 {
	public static void main(String []args)
	{ 
		System.out.println("The numbers Which are divisible by 3:");
		  for(int i=0;i<=100;i++)
		  {
			  
			  if(i%3==0)
			  {
				  System.out.print(i+",");
				  
			  }
		  }
		  System.out.println();
		  System.out.println("The numbers Which are divisible by 5:");
		  for(int i=0;i<=100;i++)
		  {
			  
			  if(i%5==0)
			  {
				  System.out.print(i+",");
				  
			  }
		  }
		  System.out.println();
		  System.out.println("The numbers Which are divisible by 3 and 5:");
		  for(int i=0;i<=100;i++)
		  {
			  
			  if((i%3==0)&&(i%5==0))
			  {
				  System.out.print(i+",");
				  
			  }
		  }
	}

}

package practices;

public class test {
	
	int m1(int x,int y)
	{
		int c=x+y;
		return c;
	}
	
	public static void main(String args[])
	{
		test m=new test();
		
		int x=m.m1(3, 4)+1;
		System.out.println(x);
	}

}

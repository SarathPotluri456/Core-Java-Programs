package shallowAndDeepCopies;

public class CopyConstructor {
	int a;
	int b;
	CopyConstructor(int a,int b)
	{
		this.a=a;
		this.b=b;
	}
	CopyConstructor(CopyConstructor a)
	{
		this.a=a.a;
		this.b=a.b;
		
	}
	
	public static void main(String []args)
	{
		CopyConstructor c1=new CopyConstructor(20,30);
		CopyConstructor c2=new CopyConstructor(c1);
		c2.a=40;
		c2.b=70;
		System.out.println(c1.a+" "+c1.b+" "+c2.a+" "+c2.b);
		
	}

}

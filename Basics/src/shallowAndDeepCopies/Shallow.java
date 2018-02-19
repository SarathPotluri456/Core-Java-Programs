package shallowAndDeepCopies;

public class Shallow {
	int a=10;
	int b=20;
	public static void main(String []args)
	{
		
		Shallow s1=new Shallow();
		Shallow s2=s1;
		s2.a=60;
		s2.b=90;
		System.out.println(s1.a+" "+s1.b+" "+s2.a+" "+s2.b);
	}

}

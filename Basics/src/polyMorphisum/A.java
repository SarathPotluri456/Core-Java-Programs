package polyMorphisum;

public class A {
	public A()
	{
		System.out.println("Constructor A is invoked");
	}
	void m1()
	{
		System.out.println("Testing of A Class with m1 method");
	}
	void add(int x,int y)
	{
		int z=y+x+1;
		System.out.println("The addition value of A class:"+z);
	}
	void sub(int x,int y)
	{
		int z=y-x;
		System.out.println("The Substraction value of A class:"+z);
	}
	void add(int x,int y,int z)
	{
		int z1=x+y+z;
		System.out.println("The Addition of Three integers in A Class:"+z1);
	}
	void add(double x,int y,int z)
	{
		double z1=x+y+z;
		System.out.println("The Addition of one double and Two Intigers:"+z1);
	}

}

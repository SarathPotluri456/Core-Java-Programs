package polyMorphisum;

public class B extends A {
	B()
	{
		System.out.println("Constructor B is invoked");
	}
	@Override
	void m1()
	{
		super.m1();
		System.out.println("Testing of B Class with m1 method");
	}
	@Override
	void add(int x,int y)
	{
		super.add(x, y);
		int z=y+x;
		System.out.println("The addition value of B class:"+z);
	}
	@Override
	void sub(int x,int y)
	{
		super.sub(x, y);
		int z=x-y;
		System.out.println("The Substraction value of B class:"+z);
	}
}

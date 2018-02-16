package multilevelInheritance;

public class C extends B{
	void m3()
	{

	b=a+b;
	a=b-a;
	b=b-a;
	System.out.println("After Swapping of A,B: "+a+","+b);
	}

}

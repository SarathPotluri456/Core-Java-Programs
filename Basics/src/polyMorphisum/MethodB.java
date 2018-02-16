package polyMorphisum;

public class MethodB extends MethodA {
	 void m1()
	   {
		 super.m1();
		   System.out.println("MethodA constructor invoked");
	   }
	 @Override
	 int m2(int x)
	 {
		 return x;
	 }
	public static void main(String []args)
	{
		MethodB b=new MethodB();
		b.m1();
		System.out.println(b.m2(3));
	}

}

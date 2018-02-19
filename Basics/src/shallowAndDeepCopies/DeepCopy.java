package shallowAndDeepCopies;

public class DeepCopy implements Cloneable
{

	DeepCopy p;
	
	int a=10;
	int b=20;
	int c=30;
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public static void main(String []args)
	{
		DeepCopy d1=new DeepCopy();
		DeepCopy d2;
		try {
			
			d2 = (DeepCopy)d1.clone();
			d2.c=50;
			System.out.println("The Values of d1 is"+d1.a+" "+d1.b+" "+d1.c);
			System.out.println("The Values of d2 is"+d2.a+" "+d2.b+" "+d2.c);
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}

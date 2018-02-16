package hybridInheritance;

public class Client {
	public static void main(String []args)
	{
		System.out.println(" Calling methods from B class Object");
		B b=new B();
		b.m1();
		b.m2();
		System.out.println(" Calling methods from D class Object");
		D d=new D();
		d.m1();d.m3();d.m4();
	}

}

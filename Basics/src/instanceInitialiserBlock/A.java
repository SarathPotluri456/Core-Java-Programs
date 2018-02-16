package instanceInitialiserBlock;

public class A {
	int a,b;
	{a=10;b=20;}
	public static void main(String[] args) {
		A a=new A();
		a.a=30;
		System.out.println(a.a+","+a.b);
		
	}

}

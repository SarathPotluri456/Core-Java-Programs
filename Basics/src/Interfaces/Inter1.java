package Interfaces;

public interface Inter1 {
	
	
	int a=5;
	default void m1()
	{
		System.out.println("Static method is invoked");
	}
	void add(int x,int y);
	void add(int x,int y,int z);
	void mul(int x,int y);
	void dev(int x,int y);
	void mod(int x,int y);

}

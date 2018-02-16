package Interfaces;

public class ArthImpl extends Arth1 {

	@Override
	public void add(int x, int y) {
	    int c=x+y;
	    System.out.println("The Adding Value:"+c);
		
	}

	@Override
	public void mul(int x, int y) {
		int c=x*y;
		System.out.println("The Multiplication Value:"+c);
		
	}

	@Override
	public void dev(int x, int y) {
       int c=x/y;
       System.out.println("The Division Value:"+c);
	}

	@Override
	public void mod(int x, int y) {
		int c=x%y;
		System.out.println("The MOd value:"+c);
		
	}

	@Override
	public void add(int x, int y, int z) {
		// TODO Auto-generated method stub
		
	}

}

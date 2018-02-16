package encapsulation;

public class Client {

	public static void main(String[] args) {
		FirstClass f=new FirstClass();
		
		f.setA(20);
		f.setB(40);
		int c=f.getA()+f.getB();
		System.out.println(c);

	}

}

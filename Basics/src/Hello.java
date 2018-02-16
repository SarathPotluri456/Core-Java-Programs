import basicOperations.*;
public class Hello {

	public static void main(String[] args) {
		 System.out.println("Addition Value of (10,20):"+new Addition().calculate(10,20));
		 System.exit(0);
		  Substraction s=new Substraction();
		  System.out.println("Substraction value of(10,20):"+s.calculate(10,20));
		  Multiplication m=new  Multiplication();
		  System.out.println("Multiplication value of(10,20):"+m.calculate(10, 20));
		  Division d=new Division();
		  System.out.println("Division value of(20,10):"+d.calculate(20, 10));
		  MaduloDivision md=new MaduloDivision();
		  System.out.println("Madulo Division of(20,10):"+md.calculate(20, 10));
	}

}

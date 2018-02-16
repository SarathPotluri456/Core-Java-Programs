package Aggregation;

public class Client {
	public static void main(String []args)
	{
		Address add1=new Address("Hyd","Telungana","IND");
		Address add2=new Address("VZG","Andra","IND");
		Employee emp1=new Employee(121,"Sarath",25,add1);
		Employee emp2=new Employee(122,"Sarath Potluri",26,add2);
		emp1.display();
		emp2.display();
			
	}

}

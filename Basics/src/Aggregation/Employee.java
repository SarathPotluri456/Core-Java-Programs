package Aggregation;

public class Employee {
	
	int EmpId;
	String name;
	int age;
	Address address;
	public Employee(int EmpId,String name,int age,Address address)
	{
		this.EmpId=EmpId;
		this.age=age;
		this.name=name;
		this.address=address;
	}
	void display()
	{
		System.out.println("The Id of Employee: "+this.EmpId+"\n The Name of Employee: "+this.name
				+"\nThe Age of Emploee: "+this.age);
		System.out.println("The City of Employee: "+address.city+"\n The State of Employee: "+address.state
				+"\nThe Country of Employee: "+address.country);
	}

}

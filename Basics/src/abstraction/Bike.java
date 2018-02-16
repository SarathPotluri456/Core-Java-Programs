package abstraction;

public abstract class Bike {
	
	Bike()
	{
		System.out.println("The Bike is newly Imported");
	}
	abstract void run();
	void milage()
	{
		System.out.println("The milage of Biker is:250km/hr");
	}

}

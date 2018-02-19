package practices;

public class ToString {
	 int rollno;
	 String name;
	 public ToString(int rollno,String name)
	 {
		 this.rollno=rollno;
		 this.name=name;
	 }
     
	 public String toString()
	 {
		 return rollno+" "+name;
	 }

	public static void main(String[] args) {
		System.out.println(new ToString(111,"Sarath"));
		System.out.println(new ToString(222,"Potluri"));
	}

}

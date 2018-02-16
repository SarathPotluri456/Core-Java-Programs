package objectClone;

public class Clone  implements Cloneable
{
	
	int x,y;
	public Clone(int x,int y)
	{
		this.x=x;
		this.y=y;
	}
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}
 public static void main(String []args)
 {
	 try
	 {
	 Clone c=new Clone(5,6);
	 Clone c1=(Clone)c.clone();
	 c1.x=30;
	 c1.y=50;
	 System.out.println("The values of c is"+c.x+" "+c.y);
	 System.out.println("The values of c1 is"+c1.x+" "+c1.y);
	 
	 }
	 catch(Exception e)
	 {
		 
	 }
 }

}

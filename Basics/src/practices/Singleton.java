package practices;

public class Singleton {
	 
	 private static Singleton st;
	   
	  private Singleton()
	  {
		  
	  }
	    
	  public static Singleton getInstance()
	  {
		  if(st == null){
	            st = new Singleton();
	        }
		  return st;
	  }
	  
	  void hai()
	  {
		  System.out.println("Please Say Hai");
	  }
	  
	  public static void main(String []sarath)
	  {
		  Singleton sa=Singleton.getInstance();
		  sa.hai();
	  }

}

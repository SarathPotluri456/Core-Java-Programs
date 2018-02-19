package downCasting;

class Dwclassc extends Dwclass {  
  static void method(Dwclass a) {  
	  Dwclassc d=(Dwclassc) a;
       System.out.println("ok downcasting performed");  
  } 
  
   public static void main(String []args) {  
	   Dwclass a=new Dwclassc();  
	   Dwclassc.method(a);
  }  
}  
		
		



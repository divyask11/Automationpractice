package nov4overriding;
   class parent1{
	   private void  a1() {
		   System.out.println(" its parent  private m1");
	   }
	   protected void m2() {
		   System.out.println(" its parent m2 ");
	   }
   }
   
   class child1 extends parent1{
	  
	   
	   public void  a1() {
		   System.out.println(" its child   private m1");
	   }
	   @Override 
	   
	   protected void m2() {
		   System.out.println(" its child  m2 ");
	   }
	   
   }
   
   
public class example6 {

	public static void main(String[] args) {
  parent1 p1=new parent1();
  p1.m2();
//obj1.m1();//compile time error as private members can;t be access from outside the class	}

  System.out.println("******************************************");
  child1 c1=new child1();
 c1.m2();
 c1.a1();
  
 System.out.println("**************************************************");
 parent1 p2= new child1();
 p2.m2();
 
 
}
}

/**
In java we can increase the visibility of members but we can not decrease it
private -- can't override because they won;t get inherited to child class and we can't change its access modifier while override
default --> default/protected/public
protected -->protected/public
public ----> public

private member of parent class can't be overridden
*/





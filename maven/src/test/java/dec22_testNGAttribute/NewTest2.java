package dec22_testNGAttribute;

import org.testng.annotations.Test;

public class NewTest2 {
	
  @Test(enabled=false)
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(enabled=true,priority=1)
  public void test3() {
	  System.out.println("test3");
  }
  
  @Test(enabled=true , priority=2, invocationCount=3)
  public void test2() {
	  System.out.println("test2");
  }
  
  @Test(enabled=true , priority=3,invocationCount=1,timeOut=2000)
  public void test4() throws InterruptedException {
	  System.out.println("test4,hellow");
  }
  @Test(enabled=true , priority=0,invocationCount=1,dependsOnMethods = "test4")
  public void test5() throws InterruptedException {
	  System.out.println("test5,hellow");
  }
  
  //exception handle
  
  @Test(enabled=true , priority=6,expectedExceptions = ArithmeticException.class)
  public void test6() {
	  System.out.println("test6,hello");
	  int x=10/0;
	  System.out.println("t6 is excecutes succesfully?");
  }
}
/*
@Test method attributes:
 	enabled: by default true which mean method must be executed
 			 false: which means this method won;t be executed
 	priority: be default priority is zero set for all test method
 			in case if test methods are having common priority, dn common priority test method 
 			will be executed in alphabetical order
 	innocationCount: this will help to execute a Test method multiple times depends on defined value
 			
 		
 */

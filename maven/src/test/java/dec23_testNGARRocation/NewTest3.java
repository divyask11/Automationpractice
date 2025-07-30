package dec23_testNGARRocation;

import org.testng.annotations.Test;

public class NewTest3 {
	
  @Test(enabled=false)
  public void test1() {
	  System.out.println("test1");
  }
  
  @Test(enabled=true,priority=1)
  public void test3() {
	  System.out.println("test3");
  }
  
  //description 
  @Test(enabled=true , priority=3, invocationCount=1,description="hey,these is testng excecution")
  public void test2() {
	  System.out.println("test2");
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

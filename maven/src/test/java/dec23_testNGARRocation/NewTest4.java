package dec23_testNGARRocation;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class NewTest4 {
	
	
	@BeforeSuite
	
	public void beforesuitTest() {
		
		System.out.println("a am beforesuit TstNG annotation");
  }
	
	@AfterSuite
	
	public void aftersuitTest() {
		
		System.out.println("a am afteresuit TstNG annotation");
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

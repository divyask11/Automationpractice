package dec23_testNGARRocation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotation4 {
  @Test
  public void testCase1() {
	  System.out.println("Hello, I am TC1...");
  }
 
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("I am beforeMethod");
  }

  @AfterMethod
  public void afterMethod() {
	  System.out.println("I am afterMethod");
  }

  @Test
  public void testCase2() {
	  System.out.println("Hello, I am TC2...");
  }

}
/*
when you have common pre-requisite & post-requisite behalf of each test method

Login
	createPIM
Logout
login
	editPIM
logout
login
	deletePIM
logout

*/

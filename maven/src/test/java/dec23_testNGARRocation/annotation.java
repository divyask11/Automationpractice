package dec23_testNGARRocation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotation {
  @Test
  public void testsace1() {
	  System.out.println("hwllo, i am test case 1");//2
  }
  @BeforeTest
  public void beforeTest() {
	  System.out.println("hello, i am before test");//1
  }
  @Test
  public void testsace3() {
	  System.out.println("hwllo, i am test case 3");//3
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("hello,i am after test");//4
  }
  @Test
  public void testsace2() {
	  System.out.println("hwllo, i am test case 2");//3
  }

}

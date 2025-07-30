package dec23_testNGARRocation;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class annotation2 {
  @Test
  public void testsace1() {
  }
  @BeforeTest
  public void beforeTest() {
  }

  @AfterTest
  public void afterTest() {
  }

}

/*
when you have common pre-requisite & post-requisite behalf of all test method

Login
	createPIM
	editPIM
	deletePIM
logout

*/
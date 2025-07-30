package dec23_testNGARRocation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumUtil.seleniumUtil;

public class validation2 extends seleniumUtil {

  //asert valid 
  @Test(enabled=true)
  public void testactitimeloginassertVALID() {
	WebDriver driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
	
	typetext(driver.findElement(By.id("username")),"admin12" );
	typetext(driver.findElement(By.name("pwd")),"admin12" );
	clickonElement(driver.findElement(By.id("loginButton")));
	
	String expectedTitle="actiTIME - Enter Time-Track";
	String actualtitle=getapplicationtitleexpected(expectedTitle);
	
	//Assert.assertEquals(actualtitle, expectedTitle);
	Assert.assertEquals(actualtitle, expectedTitle,"WITH MSG.... ");
  
	driver.close();
   
  } @Test
  public void testactitimeusernamevalid() {
		WebDriver driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
		
		boolean res=driver.findElement(By.id("username")).isDisplayed ();
	//	Assert.assertTrue(res);
		Assert.assertTrue(res,"Either application is not loaded or username input field is not available in the screen");
		driver.close();
		}
 @Test
public void testactitimecheckbox() {
		WebDriver driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
		
		boolean res=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	//	Assert.assertFalse(res);// we want check box is doesn selected by default and result is true 
		Assert.assertTrue(res,"Either application is not loaded or checkbox is selected by default ");
		
		driver.quit()
		;
		}

  
}
/*
 * these code was opern the browse in every time whwn we execute the test no we want to open browser in one tym tn we use gloobal vriable an
 * and set the priority
 * 
 * 
 * 
 * 
 * 
 * 
Assert:
 	Assert.assertEquals(arg1, arg2);
 	Assert.assertEquals(arg1, arg2,"msg");
 	
 	Assert.assertTrue(boolean condition);//expected condition result as true to get test case pass
 	Assert.assertTrue(boolean condition,"msg");
 	
 	Assert.assertFalse(boolean condition);//expected condition result as false to get test case pass
 	Assert.assertFalse(boolean condition,"msg");
 */

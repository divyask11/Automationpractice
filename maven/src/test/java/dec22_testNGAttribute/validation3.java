package dec22_testNGAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumUtil.seleniumUtil;

public class validation3 extends seleniumUtil {
// create global
	WebDriver driver;
	
	
	
	
  //asert valid 
  @Test(enabled=true,priority=3)
  public void testactitimeloginassertVALID() {
	
	typetext(driver.findElement(By.id("username")),"admin12" );
	typetext(driver.findElement(By.name("pwd")),"admin12" );
	clickonElement(driver.findElement(By.id("loginButton")));
	
	String expectedTitle="actiTIME - Enter Time-Track";
	String actualtitle=getapplicationtitleexpected(expectedTitle);
	
	//Assert.assertEquals(actualtitle, expectedTitle);
	Assert.assertEquals(actualtitle, expectedTitle,"WITH MSG.... ");
  
   
  } @Test(enabled=true,priority=2)
  public void testactitimeusernamevalid() {
		
		boolean res=driver.findElement(By.id("username")).isDisplayed ();
	//	Assert.assertTrue(res);
		Assert.assertTrue(res,"Either application is not loaded or username input field is not available in the screen");
		
		}
  
  
  
 @Test(enabled=true,priority=1)
public void testactitimecheckbox() {
	 // thsese perform 1st and open browser
		 driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
		
		boolean res=driver.findElement(By.id("keepLoggedInCheckBox")).isSelected();
	//	Assert.assertFalse(res);// we want check box is doesn selected by default and result is true 
		Assert.assertFalse(res,"Either application is not loaded or checkbox is selected by default ");
		
		}

 }







/*
 * these code was opern the browse in every time whwn we execute the test no 
 * we want to open browser in one tym tn we use gloobal vriable an
 * and set the priority
 
 */

package dec22_testNGAttribute;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import seleniumUtil.seleniumUtil;

public class validation extends seleniumUtil {
  @Test(enabled=false)
  public void testactitimelogin() {
	WebDriver driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
	
	typetext(driver.findElement(By.id("username")),"admin12" );
	
	typetext(driver.findElement(By.name("pwd")),"admin12" );
	clickonElement(driver.findElement(By.id("loginButton")));
	
	String expectedTitle="actiTIME - Enter Time-Track";
	String actualtitle=getapplicationtitle();
	System.out.println("is login succesful:"+actualtitle.equals(expectedTitle));
	
	  
	  }
  
  //WithAssert FAILDE CONDITION
  @Test(enabled=true)
  public void testactitimeloginassert() {
	WebDriver driver=  setup("Chrome", "https://online.actitime.com/usb/login.do");
	
	typetext(driver.findElement(By.id("username")),"admin12" );
	typetext(driver.findElement(By.name("pwd")),"admin12" );
	clickonElement(driver.findElement(By.id("loginButton")));
	
	String expectedTitle="actiTIME - Enter Time-Track";
	String actualtitle=getapplicationtitle();
	
	//Assert.assertEquals(actualtitle, expectedTitle);
	Assert.assertEquals(actualtitle, expectedTitle,"WITH MSG.... ");
	
}
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
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  } 
}

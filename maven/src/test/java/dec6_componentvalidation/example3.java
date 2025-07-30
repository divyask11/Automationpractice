package dec6_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriver driver =new ChromeDriver();
		
		//maximixe the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//get link
		driver.get("https://online.actitime.com/usb/login.do");
		
		//validate LOGINBUTTON
		 driver.findElement(By.id("loginButton")).click();
		 
		 
		 
		 //error msg elemnt it take a time so we add explicit time wait 
		 
		 WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(60));
		 
		 wait.until(ExpectedConditions.textToBe(By.className("errormsg"),"Username or Password is"
		 		+ " invalid. Please try again."));
		 
		 
	     //FOR ERROR MSG
	    WebElement errormsg =driver.findElement(By.className("errormsg"));
	    
	    
	    System.out.println("error msg font color:"+errormsg.getCssValue("color"));
	    System.out.println("eroor msg size:"+errormsg.getCssValue("font-size"));
	    System.out.println("eroor msg font family :"+errormsg.getCssValue("font-family"));


		
		 
	}

}
/*
validate error msg position
*/

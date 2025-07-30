package dec6_componentvalidation;

import java.awt.Point;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.build.EntryPoint;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//get instance 
		WebDriver driver=new FirefoxDriver();
		
		//maximize window
		driver.manage().window().maximize();
		
		//implicitly time
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//get link
		driver.get("https://demowebshop.tricentis.com/login");
		
		
		//click on login butoon 
		driver.findElement(By.className("login-button")).click();
		
		//we create explicit time wait 
		
		//WebDriverWait wait =new WebDriverWait(driver,Duration.ofSeconds(30));
		
		//wait.until(ExpectedConditions.textToBe(By.className("validation-summary-errors"),"Login was unsuccessful. Please correct the errors and try again.No customer account found "));
		
		
		WebElement error=driver.findElement(By.className("validation-summary-errors"));
		
	org.openqa.selenium.Point error_cord =error.getLocation();
	int error_cord_Y= error_cord.getY();
	System.out.println("error msg cord:"+error_cord_Y);
	
	
	WebElement email =driver.findElement(By.id("Email"));
	
	org.openqa.selenium.Point email_cord =email.getLocation();

	int  email_cord_Y=  email_cord.getY();
	System.out.println("error msg cord:"+ email_cord_Y);
	
	
	System.out.println("is error msg is above the email input feild :"+(error_cord_Y<email_cord_Y));
	
	System.out.println("Error msg font color: "+error.getCssValue("color"));
	System.out.println("Error msg font size: "+error.getCssValue("font-size"));
System.out.println("Error msg font family: "+error.getCssValue("font-family"));
		
	
		
		
		
	
	}

}
















/*
TC1:
open browser and url https://demowebshop.tricentis.com/login
click on login button
validate:
	error msg is getting displayed above email id input field
	error msg color
	error msg font-size
	error msg font-family

*/
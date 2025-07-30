package dec4_basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		WebDriver drive=new ChromeDriver();
		drive.get("https://demowebshop.tricentis.com/");
		//click on login butoon
		WebElement loginbutton =drive.findElement(By.linkText("Log in"));
		 loginbutton.click();
		
		      //username input 
			WebElement userinput =drive.findElement(By.id("Email"));
             userinput.sendKeys("tester01@vomoto.com");
			 
			 
 			WebElement passwordinput =drive.findElement(By.id("Password"));
 			passwordinput.sendKeys("Abc@12345");
 			
		
		
		
 			WebElement login =drive.findElement(By.className("login-button"));
 			 login.sendKeys("Log in");
 			login.click();
		
 			//click on logout butoon
 			WebElement logoutbutton =drive.findElement(By.partialLinkText("out"));
			 logoutbutton.click();
		
		
		
		
		
		
		
		/*
		TC2:
			//Open browser
			enter application url as https://demowebshop.tricentis.com/
			click on login
			enter username as tester01@vomoto.com
			enter password as Abc@12345
			click on login button
			validate login is done or not
			click on logout
			close the browser
*/
	}

}

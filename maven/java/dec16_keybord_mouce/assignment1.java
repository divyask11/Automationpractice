package dec16_keybord_mouce;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class assignment1 extends seleniumUtil{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		assignment1 ref = new assignment1();
		ref.login();
		
		
	}
	
	public void login() {
		 WebDriver driver=setup("Chrome", "https://demowebshop.tricentis.com/login");
		 
		 WebElement username =driver.findElement(By.id("Email"));
		 typetext(username,"tester01@vomoto.com");
		driver.findElement(By.id("Password")).sendKeys("Abc@12345" ,Keys.ENTER);

		
		 
	
	  
	
	}

}

/*
login into https://demowebshop.tricentis.com/login without identifying login button
tester01@vomoto.com/Abc@12345

TC2:
perform mouse hover in the menu bar
https://demowebshop.tricentis.com/login
*/
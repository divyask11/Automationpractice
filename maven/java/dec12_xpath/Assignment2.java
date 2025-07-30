package dec12_xpath;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

         WebDriver driver =new ChromeDriver();
		
		//maximixe the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//get link
		driver.get("https://sampleapp.tricentis.com/101/app.php");
		
		//click on motar cycle 
		driver.findElement(By.id("nav_motorcycle")).click();
		
		//identify uniquely
		WebElement dropdown=driver.findElement (By.id("make"));
		
		//create an instance of select class and pass the value of web element instance 
				Select slt = new Select(dropdown);
				
		slt.selectByIndex(2);
		
		//identify uniquely
		WebElement dropdown2=driver.findElement (By.id("model"));
				
		//create an instance of select class and pass the value of web element instance 
		Select slt2 = new Select(dropdown2);
						
		slt2.selectByIndex(3);
		
		//cylindercapacity
		driver.findElement (By.id("cylindercapacity")).sendKeys("1000");
		
		//engineperformance
		driver.findElement (By.id("engineperformance")).sendKeys("1200");
		

		//dateofmanufacture
		driver.findElement (By.id("dateofmanufacture")).sendKeys("10/23/2002");

		//
		//identify uniquely
				WebElement numberofseats=driver.findElement (By.id("numberofseats"));
						
				//create an instance of select class and pass the value of web element instance 
				Select slt3 = new Select(numberofseats);
								
				slt2.selectByValue("2");
				
				
	}

}


/*
TC4: https://sampleapp.tricentis.com/101/app.php
click on motorcycle and complete insurance process
*/
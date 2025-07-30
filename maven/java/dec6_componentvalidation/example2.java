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

public class example2 {

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

		Point errormsg_cord=errormsg.getLocation();
		int  errormsg_X=errormsg_cord.getX();
		int  errormsg_Y=errormsg_cord.getY();
        System.out.println("error msg cord x :"+ errormsg_X);
		System.out.println("error msg cord x :"+ errormsg_Y);
		

		//USERNAME 
		 WebElement username=driver.findElement(By.id("username"));

			Point username_cord=username.getLocation();
			int  username_X=username_cord.getX();
			int  username_Y=username_cord.getY();
	        System.out.println("error msg cord x :"+ username_X);
			System.out.println("error msg cord x :"+ username_Y);

			
			System.out.println("is error msg is displayed above input field :"+(errormsg_Y<username_Y));
		
		 		 
		 
	}

}
/*
validate error msg position
*/

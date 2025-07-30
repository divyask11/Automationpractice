package synchro_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class op_browser {

	public static void main(String[] args) {
		//create a instance of web browser
				WebDriver drive=new ChromeDriver();
				
			
				//to maximize browser screen
				drive.manage().window().maximize();
				
				//to open browser to require screen size 
				drive.manage().window().setSize(new Dimension (500,700));
				
				//to maximize browser screen
				drive.manage().window().maximize();
				
				//to avoid exception
				drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
				
				//get a url
				drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
				
				//get input forgate password 
				drive.findElement(By.className("orangehrm-login-forgot-header")).click();
				
				//you want to come back login page 
				drive.navigate().back();
				
				//you go to forgat pass page forword page once again
				drive.navigate().forward();
				
				//you want to open new page 
				drive.navigate().to("https://www.google.com");
				
			


		
		
		
	}

}

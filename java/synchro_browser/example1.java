package synchro_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import dev.failsafe.internal.util.Durations;

public class example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//create a instance of web browser
		WebDriver drive=new ChromeDriver();
		
		//to avoid no such element exception we use implicit time out 
		drive.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//after implicit wait, driver will have 0-30 sec to wait before throwing NoSuchElementException
		
		//get a url
		drive.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		//get input username 
		drive.findElement(By.name("username")).sendKeys("Admin");
		
		//get input password 
		drive.findElement(By.name("password")).sendKeys("admin123");
		
		//login button
		drive.findElement(By.className("orangehrm-login-button")).click();

		//go to user 
		drive.findElement(By.className("oxd-userdropdown-name")).click();
		
		//logout
		drive.findElement(By.linkText("Logout")).click();


	}

}

/*
TC1:
Open browser
enter application url as https://opensource-demo.orangehrmlive.com/web/index.php/auth/login
enter username as Admin
enter password as admin123
click login button
validate login is successful or not
click on profile icon
click logout link
close the browser
*/
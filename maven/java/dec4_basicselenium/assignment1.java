package dec4_basicselenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver=new ChromeDriver();
		//to avoid exception no such element 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		//username feild
		WebElement inputusername=driver.findElement(By.name("username"));
		inputusername.sendKeys("Admin");
		
		//password 
		WebElement inputpassword=driver.findElement(By.name("password"));
		inputpassword.sendKeys("admin123");
		
		WebElement loginbutton=driver.findElement(By.className("orangehrm-login-button"));

		loginbutton.click();
		
		WebElement dropdown=driver.findElement(By.className("oxd-userdropdown-tab"));
				
		dropdown.click();
		
		WebElement logout=driver.findElement(By.linkText("Logout"));
		
		logout.click();
		
		
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

}
}

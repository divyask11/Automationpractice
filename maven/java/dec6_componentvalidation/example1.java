package dec6_componentvalidation;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	private static WebElement toPasswordRecoveryPageLink;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver =new ChromeDriver();
		
		//maximixe the browser
		driver.manage().window().maximize();
		
		//implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		
		//get link
		driver.get("https://online.actitime.com/usb/login.do");
		
		//validate username
		WebElement username = driver.findElement(By.id("username"));
		System.out.println("is username input field visible on the screen?"+username.isDisplayed());
		System.out.println("is username input field editable on the screen?"+username.isEnabled());
		System.out.println("default value of usernme input field:"+username.getAttribute("placeholder"));

		
		WebElement keepLoggedInLabel = driver.findElement(By.id("keepLoggedInLabel"));
		System.out.println("is keepLoggedInLabel  input field visible on the screen?"+ keepLoggedInLabel.isDisplayed());
		System.out.println("is  keepLoggedInLabel input field clickable on the screen?"+ keepLoggedInLabel.isEnabled());
		System.out.println("default selected  keepLoggedInLabel:"+ keepLoggedInLabel.isSelected());
		 keepLoggedInLabel.click();
		 System.out.println("afetr selected status :"+ keepLoggedInLabel.isSelected());
		 
		 
		 WebElement toPasswordRecovery = driver.findElement(By.linkText("Forgot your password?"));
			System.out.println("is keepLoggedInLabel  input field visible on the screen?"+ toPasswordRecovery .isDisplayed());
			System.out.println("is  keepLoggedInLabel input field clickable on the screen?"+ toPasswordRecovery .isEnabled());
			System.out.println("default selected  keepLoggedInLabel:"+toPasswordRecovery.getText());
			

	}

}
/*
Username:
	visible
	editable
	default value
Checkbox:
	visible
	functional/clickable
	default selection
	after selection
Button:
	visible
	functional
	button name
*/

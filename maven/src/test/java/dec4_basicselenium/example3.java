package dec4_basicselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class example3 {

	public static void main(String[] args) {
		WebDriver driver=new EdgeDriver();
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//identify username input field
		WebElement usernameInputField=driver.findElement(By.id("username"));
		//clear username input field
		usernameInputField.clear();
		//type user name as 'admin' into username input field
		usernameInputField.sendKeys("admin");
		
		//identify password input field
		WebElement passwordInputField=driver.findElement(By.id("password"));
		passwordInputField.clear();
		passwordInputField.sendKeys("admin");
		
		//identify login button
		WebElement loginButton=driver.findElement(By.className("buttonBlue"));
		loginButton.click();
		
		String currentTitle=driver.getTitle();	
		String expectedTitle="Dashboard";
		System.out.println("Login successfull or not? "+currentTitle.equals(expectedTitle));
	}


	}



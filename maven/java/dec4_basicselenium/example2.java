package dec4_basicselenium;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		//get url
		driver.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		//identify user name
		WebElement userinputfield=driver.findElement(By.id("username "));
		//the fild is alreay present so we clear 1at privious username field
		userinputfield.clear();
		userinputfield.sendKeys("admin");
		
		//identify password 
		WebElement inputpasswordfirld=driver.findElement(By.name("password"));
		inputpasswordfirld.clear();
		inputpasswordfirld.sendKeys("admin");
		
		//identify button
		WebElement loginButton=driver.findElement(By.className(" buttonBlue"));
		loginButton.click();
		
		
		String currentTitle=driver.getTitle();	
		String expectedTitle="Dashboard";
		System.out.println("Login successfull or not? "+currentTitle.equals(expectedTitle));
		driver.quit();

		
	}

	
	}



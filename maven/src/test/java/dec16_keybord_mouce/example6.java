package dec16_keybord_mouce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example6 {

	public static void main(String[] args) {
		// 


		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get("https://online.actitime.com/icb/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		username.sendKeys("admin11");
		//mouce operation 
		Actions act =new Actions(driver);
		
		act.moveToElement(username).doubleClick().build().perform();
		username.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		
		
		//find web element for pass word  and paste and click on enter 
	driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v") ,Keys.ENTER);
		
		
		
	}

}

/*
type username as amdin01
copy it and paste it into password field
press enter button

*/
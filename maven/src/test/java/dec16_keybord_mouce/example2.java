package dec16_keybord_mouce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get("https://online.actitime.com/icb/login.do");
		
		WebElement username=driver.findElement(By.id("username"));
		//type username and select it
		
		username.sendKeys("admin11",Keys.chord(Keys.CONTROL,"a"),Keys.chord(Keys.CONTROL,"c"));
		
		driver.findElement(By.name("pwd")).sendKeys(Keys.chord(Keys.CONTROL,"v"),Keys.ENTER);
	}

}

package dec16_keybord_mouce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class example3 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get("https://demowebshop.tricentis.com/login");
		
		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_UP);
		Thread.sleep(1000);

		driver.findElement(By.xpath("//body")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		

	}

}

//perform operation for page down and up

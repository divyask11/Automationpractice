package dec16_keybord_mouce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class example5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get("https://jqueryui.com/droppable/");
		
		
		driver.switchTo().frame(0);
		Actions act=new Actions (driver);
		
		WebElement drag=driver.findElement(By.id("draggable")) ;
		WebElement drop=driver.findElement(By.id("droppable")) ;

		act.dragAndDrop(drag, drop).build().perform();
		
		
	}

}

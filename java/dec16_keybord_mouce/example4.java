package dec16_keybord_mouce;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class example4 {

	public static void main(String[] args) throws InterruptedException {
		// perform mouce related  operation

		WebDriver driver = new ChromeDriver();
		// to open browser on full screen use
		driver.manage().window().maximize();
		// to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		// after implicit wait, driver will have 0-30 sec to wait before throwing
		driver.get("https://demo.automationtesting.in/Register.html");
		
		
	List <WebElement> menu=	driver.findElements(By.xpath("//ul[@class='nav navbar-nav']/li/a"));
	
	//create an instance of actions class to perform mouse related operations

	Actions  act=new Actions(driver);
	
	act.moveToElement(menu.get(1)).perform();
	Thread.sleep(1000);
	
	//by x and y off set 
	act.moveToElement(menu.get(2), 100, 0).perform();
	
	//move one by one by using for loop 
	
	for(int i=0;i<menu.size();i++) {
		act.moveToElement(menu.get(i)).perform();
		Thread.sleep(1000);
		
	}
	
	
	
	
	
	
	
	}

}

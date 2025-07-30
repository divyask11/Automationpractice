package synchro_browser;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

public class example3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new EdgeDriver();
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		//after implicit wait, driver will have 0-30 sec to wait before throwing NoSuchElementException
		driver.get("https://online.actitime.com/ubs/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		
		driver.findElement(By.id("loginButton")).click();
		
		//Explicit wait - FluentWait
		Wait<WebDriver> wait=new FluentWait<WebDriver>(driver)
								.withTimeout(Duration.ofSeconds(20))
								.pollingEvery(Duration.ofSeconds(5))
								.ignoring(NoSuchElementException.class);
		
		
		String expectedTitle="actiTIME - Enter Time-Track";
		
		//implementing conditional wait, this will wait for max 20 sec to get exact title match
		wait.until(ExpectedConditions.titleIs(expectedTitle));
		
		String actualTitle=driver.getTitle();
		System.out.println("Actual title received: "+actualTitle);
		System.out.println("is login successfull?  "+actualTitle.equals(expectedTitle));
		
		//implementing conditional wait
		wait.until(ExpectedConditions.elementToBeClickable(By.id("logoutLink")));
		driver.findElement(By.id("logoutLink")).click();


	}

}

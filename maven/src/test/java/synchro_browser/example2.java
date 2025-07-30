package synchro_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class example2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver=new FirefoxDriver();
		
		//to avoid NoSuchElementException defining implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//after implicit wait, driver will have 0-30 sec to wait before throwing NoSuchElementException
		driver.get("https://online.actitime.com/ubs/login.do");
		
		driver.findElement(By.id("username")).sendKeys("admin01");
		driver.findElement(By.name("pwd")).sendKeys("admin01");
		
		driver.findElement(By.id("loginButton")).click();
		
		//Explicit wait - WebDriverWait
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(20));
		
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

/*
TC1:
Open browser
enter application url as https://online.actitime.com/ubs/login.do
enter username as admin01
enter password as admin01
click login button
validate login is successful or not
click logout link
close the browser
*/
	}



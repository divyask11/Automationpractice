package dec4_basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class example1 {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.saucedemo.com/?//r/n%22+%20%22validate%22");
		
		//identify usenamefeild
		WebElement userinputfeild=driver.findElement(By.id("user-name"));
		userinputfeild.sendKeys("standard_user");
		
		//identify passwordfield
		WebElement passwordinputfeild=	driver.findElement(By.name("password"));
		passwordinputfeild.sendKeys("secret_sauce");
		
		//IDENTIfy login
		WebElement loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
		
		String currenturl=driver.getCurrentUrl();
		System.out.println("compare url:"+currenturl.endsWith(".html"));
		
	}

}
/*
Step1: identify the required element using findElement(By)

findElement(By)- use to identify the element using "By" class and this class has predefined methods which are also known as locators and return the WebElement.

WebElement element=driver.findElement(By.id(""));
										.name(""));
										.linkText(""));
										.className(""));
										.partialLinkText(""));
										.tagName(""));
										.cssSelector(""));
										.xpath(""));
										
Step2: once you identify the WebElement you can perform required operation it
	a. type text  			----> sendkeys("");
	b. delete existing text ----> clear();
	c. click on element     ----> click();
	
	element.sendkeys("amdin");
	element.clear();
	element.click();

*/
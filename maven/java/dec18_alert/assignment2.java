package dec18_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import seleniumUtil.seleniumUtil;

public class assignment2  extends seleniumUtil{

	public static void main(String[] args) {
		assignment2  ref = new assignment2 ();
	//	ref.msgpopuptimer();
		//ref.msgpopupconfirm();
		ref.msgpopuppromtButton();
		

	}

	public void msgpopuptimer() {
	WebDriver driver=	setup("Chrome", "https://demoqa.com/alerts");
	
	//driver.switchTo().frame(0);
//	driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);

	clickonElement(driver.findElement(By.cssSelector("#timerAlertButton")));
	System.out.println("alert msg:"+driver.switchTo().alert().getText());
	driver.switchTo().alert().accept();
	
		
	}
	public void msgpopupconfirm() {
		WebDriver driver=	setup("Chrome", "https://demoqa.com/alerts");
		
		//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//body")).sendKeys(Keys.DOWN);

		clickonElement(driver.findElement(By.cssSelector("#confirmButton")));
		System.out.println("alert msg:"+driver.switchTo().alert().getText());
		//driver.switchTo().alert().accept();
		driver.switchTo().alert().dismiss();
	}
	public void msgpopuppromtButton() {
		WebDriver driver=	setup("Chrome", "https://demoqa.com/alerts");
		
		//driver.switchTo().frame(0);
	//driver.findElement(By.xpath("//body")).sendKeys(Keys.DOWN);

		clickonElement(driver.findElement(By.cssSelector("#promtButton")));
		System.out.println("alert msg:"+driver.switchTo().alert().getText());
		driver.switchTo().alert().sendKeys("divya");
		driver.switchTo().alert().accept();
		//driver.switchTo().alert().dismiss();
	}
}

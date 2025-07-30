package dec17_switching_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class frameex1 extends seleniumUtil {

	public static void main(String[] args) throws InterruptedException {
		frameex1 ref = new frameex1();
		ref.handlingframeusingwebelement();

	}
	
	
	public void handlingframeusingwebelement() throws InterruptedException {
		
		WebDriver driver=setup("Chrome", "https://jqueryui.com/");
		clickonElement(driver.findElement(By.linkText("Autocomplete")));
		//to perform any operation inside the frame 
		WebElement frm=driver.findElement(By.cssSelector(".demo-frame"));
		//frame syntax for web element 
		driver.switchTo().frame(frm);
		
		//now you are allowed to perform operation inside the frame only

		typetext(driver.findElement(By.id("tags")), "ja");
		
		Thread.sleep(1000);
		
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		//to perform operation on the element present outside the frame, dn switch to main page

		driver.switchTo().defaultContent();
		clickonElement(driver.findElement(By.cssSelector(".logo")));
		
		
		
		
		
		
		
	}

}

package dec17_switching_frame;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class frameex2 extends seleniumUtil {

	public static void main(String[] args) throws InterruptedException {
		frameex2 ref = new frameex2();
		ref.handlingframeusingindex();

	}
	
	// by index based
	
	public void handlingframeusingindex() throws InterruptedException {
		
		WebDriver driver=setup("Chrome", "https://jqueryui.com/");
		clickonElement(driver.findElement(By.linkText("Autocomplete")));
		//to perform any operation inside the frame  using index
		
		WebElement frm=driver.findElement(By.cssSelector(".demo-frame"));
		//frame syntax for index base
		driver.switchTo().frame(0);
		
		//now you are allowed to perform operation inside the frame only

		typetext(driver.findElement(By.id("tags")), "ja");
		
		Thread.sleep(1000);
		
		driver.switchTo().activeElement().sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
		
		//to perform operation on the element present outside the frame, dn switch to main page

		driver.switchTo().defaultContent();
		clickonElement(driver.findElement(By.cssSelector(".logo")));
		
		
		
		
		
		
		
	}

}

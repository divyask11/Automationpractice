package dec17_switching_frame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class switchex1 extends seleniumUtil {

	public static void main(String[] args) {
		switchex1 ref=new switchex1();
		ref.loginwithoutidentifyanyelement();
		
		
	}
	
	
	
	
	public void loginwithoutidentifyanyelement() {
		WebDriver driver=setup("Chrome", "https://online.actitime.com/usb/login.do");
		
		driver.switchTo().activeElement().sendKeys("admin11",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("admin11",Keys.ENTER);
		
	}

}

package dec17_switching_frame;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class assignment1 extends seleniumUtil {

	public static void main(String[] args) {
		assignment1 ref=new assignment1();
		ref.loginwithoutidentifyanyelementdemo();
		
		
	}
	
	
	
	
	public void loginwithoutidentifyanyelementdemo() {
		WebDriver driver=setup("Chrome", "https://demowebshop.tricentis.com/login");
		
		driver.switchTo().activeElement().sendKeys("tester01@vomoto.com",Keys.TAB);
		
		driver.switchTo().activeElement().sendKeys("Abc@12345",Keys.ENTER);
		
	}

}
/*
TC1:
login into https://demowebshop.tricentis.com/login without identifying any object
tester01@vomoto.com/Abc@12345
*/
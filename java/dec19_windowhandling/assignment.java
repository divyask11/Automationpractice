package dec19_windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumUtil.seleniumUtil;

public class assignment extends seleniumUtil {

	public static void main(String[] args) {
		assignment ref = new assignment();
		ref.windowop();
		
		// click on ecatering
		
	}
	
	void windowop() {
	WebDriver driver=	setup("Chrome","https://erail.in/");
		
	//crrent window id 
	String homewinId=driver.getWindowHandle();
		// click on element
		clickonElement(driver.findElement(By.linkText("eCatering")));
		//get all window id 
		Set<String> allwinId=driver.getWindowHandles();
		
		//get child window in to remove parent window 
		allwinId.remove(homewinId);
		
		//create iterator 
	Iterator <String>	itr=allwinId.iterator();
	
	
	//child window 
	String chilwinid=itr.next();
	
	//now you can switch youe control to childwindow 
	driver.switchTo().window(chilwinid);
	// perform opration on child window 
	
	
	typetext(driver.findElement(By.xpath("//input[@class='form-input pl-12  h-16 pl-12 pr-4 text-lg shadow-6dp']")), "12627");
			
		
		
	}

}

/**
open browser https://erail.in/
click on eCatering
enter train number as 12627 and select it from suggestion
select future date for boarding
select boarding station as itarsi
click on find food
get all restaurant names
come back to main page
From Pune
to Mumbai
date in future
print 
	train number
	train name
	Dept time
	Travel time
*/
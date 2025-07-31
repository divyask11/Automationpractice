package dec19_windowhandling;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumUtil.seleniumUtil;

public class example1 extends seleniumUtil {

	public static void main(String[] args) {

		example1 ref = new example1();
		ref.windowhandling();
	}
	
	
	void windowhandling() {
	WebDriver driver=	setup("Chrome", "https://etrain.info/in");
	
	//get current parent window if
	String homewindowid=driver.getWindowHandle();
	
	// click on element that is open new window 
	clickonElement(driver.findElement(By.cssSelector(".icon-twitter")));
	
	//get all window id = it will return the  set of string list 
	Set <String > allwindowid=driver.getWindowHandles();
	
	//get child window id =remove parent window (home window)
	allwindowid.remove(homewindowid);
	// create iterator = return string  
	Iterator <String> itr =allwindowid.iterator();
	
	//String allwindow
	String childwinid=itr.next();
	
	// now you switch your control home window to child window 
	driver.switchTo().window(childwinid);
	
	// add explicit wait condition 
	String title= getapplicationtitleexpected("Tripozo (@Tripozo) / X");
	System.out.println("child window title :"+title);
	
	//close current window 
	driver.close();
	
	// again switch to current home window 
	driver.switchTo().window(homewindowid);
	
	// get application title
	System.out.println("application title of current window :"+getapplicationtitle());
	
	
	}

}

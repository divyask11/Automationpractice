package nov29_browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class assignment2 {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		WebDriver fdrive=new FirefoxDriver();

		
			//enter application url with ref variable 
		fdrive.get("https://demowebshop.tricentis.com/");
		
	String title=	fdrive.getTitle();
		System.out.println("title:"+title);
		//validate with url
		
		String expectedurl="https://demowebshop.tricentis.com/";
		String actualurl=fdrive.getCurrentUrl();
		System.out.println("validate url:"+actualurl.equals(expectedurl));
		    
	
	}

}

/*
1TC2:
	open Firefox browser
	enter application url - https://demowebshop.tricentis.com/
	validate
		 either with application title or application url
	close the browser
*/
package nov29_browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class assignment3 {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		WebDriver idrive=new InternetExplorerDriver();

		
			//enter application url with ref variable 
		    idrive.get("https://sampleapp.tricentis.com/101/app.php");
		    
		    //validate with url
		    String actualurl="https://sampleapp.tricentis.com/101/app.php";
		    String expecteurl=idrive.getCurrentUrl();
		    System.out.println("validate url:"+expecteurl.equals(actualurl));
		    
		    //close
		    idrive.quit();
	}

}

/*TC3:
	open Edge browser
	enter application url - https://sampleapp.tricentis.com/101/app.php
	validate
		 either with application title or application url
	close the browser
*/
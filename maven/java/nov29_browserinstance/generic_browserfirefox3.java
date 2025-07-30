package nov29_browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class generic_browserfirefox3 {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		WebDriver drive=new FirefoxDriver();

		
			//enter application url with ref variable 
		    drive.get("https://demo.automationtesting.in/Register.html");
		    
		    //validate  application title 
		    String expectedtitle="Register";
		 String actualtitle=   drive.getTitle();
		 System.out.println("compare expected and actual titele:"+actualtitle.equals(expectedtitle));
		   
		 //validate url
		 String expectedurl="https://demo.automationtesting.in/Register.html";
		 String actualurl=drive.getCurrentUrl();
		 System.out.println("compare:"+actualurl.equals(expectedurl));
		 
		 //close browser
		 drive.quit();
	}

}

/*
open firefox browser
enter application url
validate
	application title
	application url
close the browser
*/
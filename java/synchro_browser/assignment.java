package synchro_browser;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		
		//implicit time 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//maximize browser 
		driver.manage().window().maximize();
		
		//enter url
		driver.get("https://demo.automationtesting.in/Register.html");
		
		String expectedurl="https://demo.automationtesting.in/Register.html";
		String actualurl=driver.getCurrentUrl();
		System.out.println("Actual title received: "+actualurl);
		System.out.println("valid   "+actualurl.equals(expectedurl));
		
		//click on webtable
		driver.findElement(By.linkText("WebTable")).click();
		
		String expectedurlweb="https://demo.automationtesting.in/WebTable.html";
		String actualurl2=driver.getCurrentUrl();
		System.out.println("Actual title received: "+actualurl);
		System.out.println("valid   "+actualurl2.equals(expectedurlweb));
		
		//come back registration page 
		driver.navigate().back();
		
		//go to web page again
		driver.navigate().forward();
		
		//close browse
		driver.close();
	}

}
/**
open browser
maximize window
enter url https://demo.automationtesting.in/Register.html
validate register page
click on WebTable
validate webtable page
come back to register page
validate register page
go to webtable page
validate webtable page
close browser
*/
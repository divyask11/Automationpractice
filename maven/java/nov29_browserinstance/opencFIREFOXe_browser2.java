package nov29_browserinstance;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class opencFIREFOXe_browser2 {

	public static void main(String[] args) {

		//Create an instance of FIREFOX class to launch FireFox browser

		 FirefoxDriver fdrive=new  FirefoxDriver();
	}

}

/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
package nov29_browserinstance;

import org.openqa.selenium.chrome.ChromeDriver;

public class generic_browser2 {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		ChromeDriver cdrive=new ChromeDriver();
	}

}

/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
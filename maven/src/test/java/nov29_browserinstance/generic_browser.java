package nov29_browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class generic_browser {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		WebDriver cdrive=new ChromeDriver();

		
			//enter application url with ref variable 
		    cdrive.get("https://www.google.com");
		    
		    //get application title 
		   String title= cdrive.getTitle();
		   System.out.println("application title:"+title);
		   System.out.println("application url char count :"+title.length());
		   
		   //application current url
		 String url= cdrive.getCurrentUrl();
		 System.out.println("application url:"+url);
		 System.out.println("application url count :"+url.length());
		 
		 //application source code 
	String sou=	 cdrive.getPageSource();
	System.out.println("lenght of source code :"+sou.length());
	
	
	}

}

/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
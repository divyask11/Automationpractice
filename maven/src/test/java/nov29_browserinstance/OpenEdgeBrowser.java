package nov29_browserinstance;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;



		public class OpenEdgeBrowser {

			public static void main(String[] args) {
				//Create an instance of EdgeDriver class to launch Edge browser
				// if u have window 7 and 8 u can create internetexplore object 
				InternetExplorerDriver edriver=new InternetExplorerDriver();
			}
		}



/*
1. WebDriver every time opens new browser, it won’t work on already opened browser
2. Browser opened by WebDriver won’t have history, cookies and plugins
*/
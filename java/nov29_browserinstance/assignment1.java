package nov29_browserinstance;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class assignment1 {

	public static void main(String[] args) {

		//Create an instance of ChromeDriver class to launch chrome browser

		WebDriver cdrive=new ChromeDriver();

		//enter application url
		cdrive.get("https://www.saucedemo.com/?//r/n%22+%20%22validate%22");
		
		//validate 
		String expectedurl="https://www.saucedemo.com/?//r/n%22+%20%22validate%22";
		String actualurl=cdrive.getCurrentUrl();
		System.out.println("validate:"+actualurl.equals(expectedurl));
		
		String title=cdrive.getTitle();
			System.out.println("application title:"+title);
			
			//compare validate with title
			String expectedtitle="Swag Labs";
			String actualtitle=cdrive.getTitle();
			System.out.println("calidate title:"+actualtitle.equals(expectedtitle));
	}

}
/*TC1:
	open chrome browser
	enter application url - https://www.saucedemo.com/
	validate
		 either with application title or application url
	close the browser
*/
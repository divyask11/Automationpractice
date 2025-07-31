package seleniumUtil;

import java.time.Duration;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class seleniumUtil {
	public static WebDriver driver;
	public static WebDriverWait wait;
	public static Actions action;
	
	public WebDriver setup(String browsername,String appurl) {
		if(browsername.equalsIgnoreCase("Chrome")) {
			driver= new ChromeDriver();
		}else if (browsername.equalsIgnoreCase("firefox")) {
			driver=new FirefoxDriver();
			
		}else if (browsername.equalsIgnoreCase("internetExplore")) {
			driver=new InternetExplorerDriver();
	}
	
	//to open browser on full screen use
	driver.manage().window().maximize();		
	//to avoid NoSuchElementException defining implicit wait
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	driver.get(appurl);
	wait= new WebDriverWait(driver,Duration.ofSeconds(20));
	action=new Actions(driver);
	return driver;

}
	
	public void typetext(WebElement element,String text) {
		waituntilelementclickable(element);
		element.clear();
		element.sendKeys(text);
	}

	
	public void clickonElement (WebElement  enter) {
		waituntilelementclickable(enter);
		enter.click();
		

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	public String getapplicationtitle() {
		return driver.getTitle();
	}
	
	public String getapplicationtitleexpected (String expectedtitle) {
		wait.until(ExpectedConditions.titleContains(expectedtitle));
		return driver.getTitle();
	}
	public void waituntilelementclickable(WebElement element) {
		wait.until(ExpectedConditions.elementToBeClickable(element));
		
	}
	public void waituntilelementvisible(WebElement element) {
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public void waituntilrequiredtextdisplayed(WebElement element , String text) {
		wait.until(ExpectedConditions.textToBePresentInElement(element, text));
		
	}
	
	public void copypaste(WebElement src, WebElement des) {
		action.moveToElement(des).doubleClick().build().perform();
		src.sendKeys(Keys.chord(Keys.CONTROL,"c"));
		des.sendKeys(Keys.chord(Keys.CONTROL,"v"));
		
		
	}
	
	public void draganddrop(WebElement src, WebElement des) {
		action.dragAndDrop(src, des).build().perform();
	}
	
}
	
	
	
	
	
	
	
	
	
	
	
	

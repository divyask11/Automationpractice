package dec18_alert;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import seleniumUtil.seleniumUtil;

public class assignment  extends seleniumUtil{

	public static void main(String[] args) {
		assignment ref=new assignment ();
		ref.switchoperation();

	}

	public void switchoperation() {
	
   WebDriver driver=setup("Chrome", "https://jqueryui.com/sortable/")	;
   
   driver.switchTo().frame(0);
   driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);
   driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);

   driver.findElement(By.xpath("//body")).sendKeys(Keys.ARROW_DOWN);

   List<WebElement> list=driver.findElements(By.cssSelector("#sortable>li"));
   for(int i=0;i<list.size()-1;i++) {
		setSleepTime(1000);
		list=driver.findElements(By.cssSelector("#sortable>li"));
		draganddrop(list.get(list.size()-1), list.get(i));
		
   }
   
   
   
	
		
		
		
	}

	private void setSleepTime(int i) {
		// TODO Auto-generated method stub
		
	}

	
		
	}


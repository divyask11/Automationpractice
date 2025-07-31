package dec16_keybord_mouce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import seleniumUtil.seleniumUtil;

public class example7 extends seleniumUtil  {

	public static void main(String[] args) {
		example7 ref = new example7();
		ref.draganddropoperation();
		


	}
		
	   public void draganddropoperation() {
	 WebDriver driver=setup("Chrome", "https://jqueryui.com/droppable/");
	 driver.switchTo().frame(0);
	 WebElement src=driver.findElement(By.id("draggable"));
	 WebElement des=driver.findElement(By.id("droppable"));

	 draganddrop(src,des);
		
	}

}

/*
type username as amdin01
copy it and paste it into password field
press enter button

*/
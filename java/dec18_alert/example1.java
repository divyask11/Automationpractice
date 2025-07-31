package dec18_alert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import seleniumUtil.seleniumUtil;

public class example1 extends seleniumUtil {

	public static void main(String[] args) throws InterruptedException {

		example1 ref=new example1();
		ref.handlepopup();
		
		
}
	
	public void handlepopup() throws InterruptedException {
		WebDriver driver=setup("Chrome", "https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		Thread.sleep(1000);
		//identify the frame element by name 
		driver.switchTo().frame("iframeResult");
		clickonElement(driver.findElement(By.xpath("//button[text()='Try it']")));
		//alert msg operation 
		System.out.println("alert msg:"+driver.switchTo().alert().getText());
		//accept msg
		driver.switchTo().alert().accept();
	}

}
